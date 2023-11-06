package lotto.event;

import lotto.domain.PaymentAmount;
import lotto.event.EventListener.ParameterAndReturnEvent;
import lotto.repository.LottoRepository;
import lotto.state.PurchasedLottoState;

public record PurchaseLottoEvent(LottoRepository lottoRepository) implements ParameterAndReturnEvent<Integer, PurchasedLottoState> {

    @Override
    public PurchasedLottoState execute(Integer input) {
        lottoRepository.save(new PaymentAmount(input));

        return null;
    }
}
