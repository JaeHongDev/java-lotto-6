package lotto.domain.exception;

import java.util.function.Supplier;

public enum DomainExceptionCode {
    PAYMENT_PRICE_IS_GREATER_THAN_MIN_SIZE("결제 금액은 최소 1000원 이상이어야 합니다."),
    PAYMENT_PRICE_MUST_BE_DIVIDE("결제 금액은 10000원으로 나누어 떨어져야 한다."),
    ;

    private final String message;

    DomainExceptionCode(String message) {
        this.message = message;
    }

    public DomainException create() {
        return new DomainException(this.message);
    }

    public void dynamicInvokeBy(Supplier<Boolean> condition) {
        if (condition.get()) {
            throw new DomainException(this.message);
        }
    }

}
