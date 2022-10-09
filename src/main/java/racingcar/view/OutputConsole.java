package racingcar.view;

import racingcar.constant.GameMessage;
import racingcar.model.Car;
import racingcar.model.Cars;

public class OutputConsole {

    public static void printErrorView(String errorMessage) {
        System.out.println(errorMessage);
    }

    public static void printRaceResult(Cars cars) {
        printResultTitle();
        printEachRaceResult(cars);
    }

    private static void printResultTitle() {
        System.out.println(GameMessage.RACE_RESULT_OUTPUT);
    }

    private static void printEachRaceResult(Cars cars) {
        for (Car car : cars.getValue()) {
            System.out.println(String.format(GameMessage.EACH_RESULT_OUTPUT, car.getName(), bar(car.getPosition())));
        }
        System.out.println();
    }

    private static String bar(int position) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            builder.append("-");
        }
        return builder.toString();
    }
}
