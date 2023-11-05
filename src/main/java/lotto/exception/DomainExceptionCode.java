package lotto.exception;

import java.util.function.Supplier;

public enum DomainExceptionCode {
    PAYMENT_IS_GREATER_THAN_MIN_SIZE("구입금액은 1000원 부터 구매 가능합니다."),
    PAYMENT_MUST_BE_DIVIDED("구입금액은 1000원으로 나누어 떨어져야 합니다."),

    LOTTO_NUMBER_IS_GREATER_THAN_MIN_SIZE("로또 번호는 1이상이어야 합니다."),
    LOTTO_NUMBER_IS_LESS_THAN_MAX_SIZE("로또 번호는 45이하여야 합니다."),
    ANSWER_LOTTO_DUPLICATE_BONUS_LOTTO("정답 로또 번호에 동일한 보너스 번호가 포함 될 수 없습니다.");


    private final String message;

    DomainExceptionCode(String message) {
        this.message = message;
    }


    public void dynamicInvokeBy(Supplier<Boolean> supplier) {
        if (supplier.get()) {
            throw new DomainException(getMessage());
        }
    }

    public String getMessage() {
        return "[ERROR] " + message;
    }
}
