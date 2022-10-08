package racingcar.model;

import racingcar.constant.GameEnvironment;
import racingcar.exception.InvalidCarNameSizeException;

public class Name {
    private final String value;

    public Name(String value) {
        verifySize(value);
        this.value = value;
    }

    private void verifySize(String value) {
        int length = value.length();

        if (length < GameEnvironment.MIN_NAME_SIZE || length > GameEnvironment.MAX_NAME_SIZE) {
            throw new InvalidCarNameSizeException();
        }
    }

    public String getValue() {
        return value;
    }
}
