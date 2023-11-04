package lotto.repository;

import java.util.Optional;
import lotto.domain.PaymentAmount;
import lotto.domain.PurchasedLottoBundle;

public class LottoRepository {
    private PaymentAmount paymentAmount;
    private PurchasedLottoBundle purchasedLottoBundle;


    public PaymentAmount save(PaymentAmount paymentAmount) {
        return this.paymentAmount = paymentAmount;
    }

    public void save(PurchasedLottoBundle purchasedLottoBundle) {
        this.purchasedLottoBundle = purchasedLottoBundle;
    }


    public Optional<PaymentAmount> getPaymentAmount() {
        return Optional.ofNullable(paymentAmount);
    }


    public Optional<PurchasedLottoBundle> getPurchasedLottoBundle() {
        return Optional.ofNullable(purchasedLottoBundle);
    }
}
