package racingcar.model;

import racingcar.exception.InvalidCarNameSizeException;

public class Name {
    private final String value;

    public Name(String value) {
        verifySize(value);
        this.value = value;
    }

    private void verifySize(String value) {
        int length = value.length();

        if (length < 1 || length > 5) {
            throw new InvalidCarNameSizeException();
        }
    }

    public String getValue() {
        return value;
    }
}
