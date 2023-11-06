package lotto.repository;

import java.util.Objects;
import lotto.domain.PaymentAmount;

public class LottoRepository {

    private PaymentAmount paymentAmount;


    public void save(PaymentAmount paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public PaymentAmount getPaymentAmount() {
        Objects.requireNonNull(paymentAmount);
        return paymentAmount;
    }
}
