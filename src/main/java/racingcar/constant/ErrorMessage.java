package racingcar.constant;

public class ErrorMessage {
  public static final int MAX_NAME_SIZE = 5;
  public static final int MIN_RACE_COUNT = 1;
  public static final String CAR_NAME_DELIMITER = ",";

  public static final String ERROR_PREFIX = "[ERROR]";

  public static final String INVALID_DELIMITER =
      String.format("%s 자동차 이름은 구분자(%s)로 구분되어야 합니다.", ERROR_PREFIX, CAR_NAME_DELIMITER);

  public static final String INVALID_CAR_NAME =
      String.format("%s 자동차 이름은 %d자 이하여야 합니다.", ERROR_PREFIX, MAX_NAME_SIZE);

  public static final String DUPLICATED_CAR_NAME =
      String.format("%s 자동차 이름은 중복될 수 없습니다.", ERROR_PREFIX);

  public static final String INVALID_RACE_COUNT_NUMBER =
      String.format("%s 시도 횟수는 숫자여야 합니다.", ERROR_PREFIX);

  public static final String INVALID_RACE_COUNT_POSITIVE =
      String.format("%s 시도 횟수는 %d 이상이어야 합니다.", ERROR_PREFIX, MIN_RACE_COUNT);
}
