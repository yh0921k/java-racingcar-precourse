package racingcar.constant;

import static racingcar.constant.GameEnvironment.CAR_NAME_DELIMITER;
import static racingcar.constant.GameEnvironment.MAX_NAME_SIZE;
import static racingcar.constant.GameEnvironment.MIN_NAME_SIZE;
import static racingcar.constant.GameEnvironment.MIN_RACE_COUNT;

public class ErrorMessage {
  public static final String ERROR_PREFIX = "[ERROR]";

  public static final String INVALID_DELIMITER =
      String.format("%s 자동차 이름은 구분자(%s)로 구분되어야 합니다.", ERROR_PREFIX, CAR_NAME_DELIMITER);

  public static final String INVALID_CAR_NAME =
      String.format("%s 자동차 이름은 %d ~ %d자 이하여야 합니다.", ERROR_PREFIX, MIN_NAME_SIZE, MAX_NAME_SIZE);

  public static final String DUPLICATED_CAR_NAME =
      String.format("%s 자동차 이름은 중복될 수 없습니다.", ERROR_PREFIX);

  public static final String INVALID_RACE_COUNT_NUMBER =
      String.format("%s 시도 횟수는 숫자여야 합니다.", ERROR_PREFIX);

  public static final String INVALID_RACE_COUNT_POSITIVE =
      String.format("%s 시도 횟수는 %d 이상이어야 합니다.", ERROR_PREFIX, MIN_RACE_COUNT);
}
