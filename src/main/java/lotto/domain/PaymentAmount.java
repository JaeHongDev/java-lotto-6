package lotto.domain;

import lotto.domain.exception.DomainExceptionCode;

public record PaymentAmount(int value) {

    public PaymentAmount {
        DomainExceptionCode.PAYMENT_PRICE_IS_GREATER_THAN_MIN_SIZE.dynamicInvokeBy(() -> value < 1000);
        DomainExceptionCode.PAYMENT_PRICE_IS_GREATER_THAN_MIN_SIZE.dynamicInvokeBy(() -> value % 1000 != 0);
    }


}
