package lotto.domain;

import java.util.List;

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
        return new AnswerLotto(lotto, bonusLotto);
    }
}
