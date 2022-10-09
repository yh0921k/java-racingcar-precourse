package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.GameMessage;

public class InputConsole {
    public static UserInput readCarNames() {
        return new UserInput(carNamesInputView());
    }

    public static UserInput readRaceCount() {
        return new UserInput(raceCountInputView());
    }

    private static String carNamesInputView() {
        System.out.print(GameMessage.CAR_NAME_INPUT);
        return Console.readLine();
    }

    private static String raceCountInputView() {
        System.out.println(GameMessage.RACE_COUNT_INPUT);
        return Console.readLine();
    }
}