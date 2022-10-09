package racingcar.model;

public class Game {

    private final Cars cars;
    private final RaceCount raceCount;

    public Game(Names names, RaceCount raceCount) {
        this.cars = new Cars(names);
        this.raceCount = raceCount;
    }

    public Cars race() {
        cars.moveAll();

        return cars;
    }
}
