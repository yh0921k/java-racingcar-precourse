package racingcar.model;

public class Position {
    private int value;

    public Position() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        this.value++;
    }
}
