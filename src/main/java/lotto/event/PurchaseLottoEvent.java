package lotto.event;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.stream.Stream;
import lotto.domain.Lotto;
import lotto.domain.PaymentAmount;
import lotto.domain.PurchasedLottoBundle;
import lotto.event.EventListener.ParameterAndReturnEvent;
import lotto.repository.LottoRepository;
import lotto.state.PurchaseLottoResultState;

public record PurchaseLottoEvent(LottoRepository lottoRepository)
        implements ParameterAndReturnEvent<Integer, PurchaseLottoResultState> {
    private PurchasedLottoBundle purchaseLottoBundle(PaymentAmount savedPayment) {
        final var availablePurchaseCount = savedPayment.availablePurchaseCount();
        return new PurchasedLottoBundle(Stream.generate(() -> Randoms.pickUniqueNumbersInRange(1, 45, 6))
                .limit(availablePurchaseCount)
                .map(Lotto::new)
                .toList());
    }

    @Override
    public PurchaseLottoResultState execute(Integer input) {
        final var savedPayment = lottoRepository.save(new PaymentAmount(input));
        final var purchasedLottoBundle = purchaseLottoBundle(savedPayment);

        lottoRepository.save(purchasedLottoBundle);

        return new PurchaseLottoResultState(purchasedLottoBundle.toNumbers());
    }
}
