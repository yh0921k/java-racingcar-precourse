package racingcar.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cars {
    private final List<Car> value;

    public Cars(Names names) {
        this.value = new LinkedList<>();
        generateCars(names);
    }

    public int size() {
        return this.value.size();
    }

    private void generateCars(Names names) {
        for (Name name : names.getValue()) {
            this.value.add(new Car(name));
        }
    }

    public List<Car> getValue() {
        return Collections.unmodifiableList(value);
    }

    public void moveAll() {
        for (Car car : value) {
            car.move(MovementPolicy.action());
        }
    }
}
