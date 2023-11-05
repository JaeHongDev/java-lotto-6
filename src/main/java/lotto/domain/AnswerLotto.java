package lotto.domain;

import static lotto.exception.DomainExceptionCode.ANSWER_LOTTO_DUPLICATE_BONUS_LOTTO;

import java.util.List;
import java.util.Objects;

public class AnswerLotto {

    private final Lotto lotto;
    private final BonusLotto bonusLotto;


    public AnswerLotto(List<Integer> numbers) {
        this.lotto = new Lotto(numbers);
        this.bonusLotto = null;
    }

    private AnswerLotto(Lotto lotto, BonusLotto bonusLotto) {
        this.lotto = lotto;
        this.bonusLotto = bonusLotto;
    }

    public AnswerLotto registerBonusLotto(BonusLotto bonusLotto) {
        ANSWER_LOTTO_DUPLICATE_BONUS_LOTTO.dynamicInvokeBy(() -> lotto.hasNumber(bonusLotto.value()));
        return new AnswerLotto(lotto, bonusLotto);
    }

    public WinningResult checkWinningResult(Lotto purchasedLotto) {
        Objects.requireNonNull(bonusLotto);
        return new WinningResult(
                lotto.matchCount(purchasedLotto),
                purchasedLotto.hasNumber(bonusLotto.value())
        );
    }
}
