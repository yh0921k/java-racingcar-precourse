package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
}
