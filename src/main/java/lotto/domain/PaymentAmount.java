package lotto.domain;

import lotto.exception.DomainExceptionCode;

public record PaymentAmount(int value) {

    public PaymentAmount {
        DomainExceptionCode.PAYMENT_IS_GREATER_THAN_MIN_SIZE.dynamicInvokeBy(() -> value < 1000);
        DomainExceptionCode.PAYMENT_MUST_BE_DIVIDED.dynamicInvokeBy(() -> value % 1000 != 0);
    }


    public int availablePurchaseCount() {
        return value / 1000;
    }

}
