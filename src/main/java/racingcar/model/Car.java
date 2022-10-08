package racingcar.model;

public class Car {
    private final Name name;
    private final Position position;

    public Car(Name name) {
        this.name = name;
        this.position = new Position();
    }

    public String getName() {
        return this.name.getValue();
    }

    public int getPosition() {
        return this.position.getValue();
    }

    public void move(MovementAction movementAction) {
        if (movementAction.isMoving()) {
            this.position.increment();
        }
    }
}
