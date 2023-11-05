package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public record PurchasedLottoBundle(List<Lotto> purchasedLottoBundle) {
    public List<List<Integer>> toNumbers() {
        return purchasedLottoBundle.stream()
                .map(Lotto::getNumbers)
                .toList();
    }

    public List<WinningResult> checkWinningResult(AnswerLotto answerLotto) {
        return purchasedLottoBundle.stream()
                .map(answerLotto::checkWinningResult)
                .collect(Collectors.toList());
    }
}
