package lotto.event;

import java.util.List;
import lotto.domain.AnswerLotto;
import lotto.event.EventListener.ParameterEvent;
import lotto.repository.LottoRepository;

public record RegisterAnswerLottoEvent(LottoRepository lottoRepository) implements ParameterEvent<List<Integer>> {

    @Override
    public void execute(List<Integer> input) {
        lottoRepository.save(new AnswerLotto(input));
    }
}
