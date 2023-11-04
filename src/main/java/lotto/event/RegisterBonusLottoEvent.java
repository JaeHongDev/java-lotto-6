package lotto.event;

import lotto.domain.BonusLotto;
import lotto.event.EventListener.ParameterEvent;
import lotto.repository.LottoRepository;

public record RegisterBonusLottoEvent(LottoRepository lottoRepository) implements ParameterEvent<Integer> {

    @Override
    public void execute(Integer input) {
        final var answerLotto = lottoRepository.getAnswerLotto().orElseThrow(IllegalArgumentException::new);
        lottoRepository.save(answerLotto.registerBonusLotto(new BonusLotto(input)));
    }
}
