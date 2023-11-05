package lotto.domain.exception;

import java.util.function.Supplier;

public enum DomainExceptionCode {


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
