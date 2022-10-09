package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.constant.ErrorMessage;
import racingcar.exception.InvalidRaceCountFormatException;
import racingcar.exception.InvalidRaceCountRangeException;
import racingcar.view.UserInput;

public class RaceCountTest {

    @Test
    @DisplayName("입력받은 레이스 횟수가 숫자가 아닐 경우 예외 발생")
    void invalidRaceCountAsNumber() {
        // given
        UserInput userInput = new UserInput("A");

        // then
        assertThatThrownBy(() -> new RaceCount(userInput))
                .isInstanceOf(InvalidRaceCountFormatException.class)
                .hasMessageContaining(ErrorMessage.INVALID_RACE_COUNT_FORMAT);
    }

    @Test
    @DisplayName("입력받은 레이스 횟수가 최소 시도 횟수 보다 작을 경우 예외 발생")
    void invalidRaceCountLessThanMinimumConfig() {
        // given
        UserInput userInput = new UserInput("0");

        // then
        assertThatThrownBy(() -> new RaceCount(userInput))
                .isInstanceOf(InvalidRaceCountRangeException.class)
                .hasMessageContaining(ErrorMessage.INVALID_RACE_COUNT_RANGE);
    }
}
