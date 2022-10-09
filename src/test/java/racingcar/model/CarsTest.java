package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import racingcar.constant.GameEnvironment;
import racingcar.view.UserInput;

public class CarsTest {

    @Test
    @DisplayName("올바른 사용자 입력(자동차 이름)에 대해 예외가 발생하지 않음")
    void validUserInputNoException() {

        // given
        UserInput userInput = new UserInput("pobi,crong,honux");
        Names names = new Names(userInput);

        // then
        assertThatNoException().isThrownBy(() -> new Cars(names));
    }

    @Test
    @DisplayName("올바른 사용자 입력(자동차 이름)에 대해 정상적인 크기의 자동차 리스트 생성")
    void validUserInputCars() {

        // given
        String value = "pobi,crong,honux";
        int size = value.split(GameEnvironment.CAR_NAME_DELIMITER).length;

        UserInput userInput = new UserInput(value);
        Names names = new Names(userInput);

        // when
        Cars cars = new Cars(names);

        // then
        assertThat(cars.size()).isEqualTo(size);
    }

    @Test
    @DisplayName("자동차 일괄 이동 검증")
    void moveAll() {
        MockedStatic<MovementPolicy> movementPolicy = Mockito.mockStatic(MovementPolicy.class);
        movementPolicy.when(MovementPolicy::action)
                .thenReturn(MovementAction.MOVE, MovementAction.STOP, MovementAction.MOVE);

        // given
        Cars cars = new Cars(new Names(new UserInput("pobi,crong,honux")));
        List<Car> carList = cars.getValue();

        // when
        cars.moveAll();

        // then
        assertThat(carList.get(0).getPosition()).isEqualTo(1);
        assertThat(carList.get(1).getPosition()).isEqualTo(0);
        assertThat(carList.get(2).getPosition()).isEqualTo(1);

        movementPolicy.close();
    }
}
