package lotto.domain;

import static lotto.exception.DomainExceptionCode.LOTTO_NUMBER_IS_GREATER_THAN_MIN_SIZE;
import static lotto.exception.DomainExceptionCode.LOTTO_NUMBER_IS_LESS_THAN_MAX_SIZE;

public record BonusLotto(int value) {
    public BonusLotto {
        LOTTO_NUMBER_IS_LESS_THAN_MAX_SIZE.dynamicInvokeBy(() -> value > 45);
        LOTTO_NUMBER_IS_GREATER_THAN_MIN_SIZE.dynamicInvokeBy(() -> value < 1);
    }

}
