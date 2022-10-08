package racingcar.model;

public class Car {
    private final Name name;

    public Car(Name name) {
        this.name = name;
    }

    public String getName() {
        return this.name.getValue();
    }
}
