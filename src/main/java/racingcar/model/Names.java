package racingcar.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import racingcar.constant.GameEnvironment;
import racingcar.view.UserInput;

public class Names {
    private final List<Name> value;

    public Names(UserInput userInput) {
        String[] names = splitByDelimiter(userInput);
        this.value = generate(names);
    }

    public int size() {
        return value.size();
    }

    public List<Name> getValue() {
        return Collections.unmodifiableList(value);
    }

    private String[] splitByDelimiter(UserInput userInput) {
        return userInput.getValue().split(GameEnvironment.CAR_NAME_DELIMITER);
    }

    private List<Name> generate(String[] names) {
        List<Name> nameList = new LinkedList<>();
        for (String name : names) {
            nameList.add(new Name(name));
        }

        return nameList;
    }

}
