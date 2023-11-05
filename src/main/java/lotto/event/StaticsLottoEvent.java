package lotto.event;

import static java.util.stream.Collectors.toMap;

import java.util.EnumSet;
import java.util.Objects;
import java.util.stream.Collectors;
import lotto.core.LottoMatchingTable;
import lotto.event.EventListener.ReturnEvent;
import lotto.repository.LottoRepository;
import lotto.state.LottoMatchResultState;

public record StaticsLottoEvent(LottoRepository lottoRepository) implements ReturnEvent<LottoMatchResultState> {
    @Override
    public LottoMatchResultState execute() {
        final var payment = lottoRepository.getPaymentAmount().orElseThrow(IllegalArgumentException::new);
        final var answerLotto = lottoRepository.getAnswerLotto().orElseThrow(IllegalArgumentException::new);
        final var purchaseLottoBundle = lottoRepository.getPurchasedLottoBundle().orElseThrow(IllegalArgumentException::new);

        return new LottoMatchResultState(purchaseLottoBundle.checkWinningResult(answerLotto)
                .stream()
                .map(winningResult -> LottoMatchingTable.of(winningResult.normalCount(), winningResult.matchBonus()))
                .filter(lottoMatchingTable -> !Objects.isNull(lottoMatchingTable))
                .collect(toMap(winningResult -> winningResult,
                        enumValue -> 1,
                        Integer::sum,
                        () -> EnumSet.allOf(LottoMatchingTable.class).stream()
                                .collect(Collectors.toMap(lottoMatchingTable -> lottoMatchingTable, (lottoMatchingTable) -> 0)))),
                payment.value()
        );

    }
}
