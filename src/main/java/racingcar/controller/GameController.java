package racingcar.controller;


import racingcar.exception.DuplicatedCarNameException;
import racingcar.exception.InvalidCarNameSizeException;
import racingcar.exception.InvalidRaceCountFormatException;
import racingcar.exception.InvalidRaceCountRangeException;
import racingcar.model.Game;
import racingcar.model.Names;
import racingcar.model.RaceCount;
import racingcar.view.InputConsole;

public class GameController {
    public static void run() {
        Game game = new Game(readNames(), readCount());

        for (int currentCount = 0; currentCount < game.getRaceCount(); currentCount++) {
            game.race();
        }
    }

    private static Names readNames() {
        try {
            return InputConsole.readCarNames();
        } catch (InvalidCarNameSizeException | DuplicatedCarNameException exception) {
            return readNames();
        }
    }

    private static RaceCount readCount() {
        try {
            return InputConsole.readRaceCount();
        } catch (InvalidRaceCountFormatException | InvalidRaceCountRangeException exception) {
            return readCount();
        }
    }
}
