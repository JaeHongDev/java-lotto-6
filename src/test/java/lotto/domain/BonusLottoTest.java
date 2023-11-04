package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import lotto.exception.DomainExceptionCode;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BonusLottoTest {


    @ParameterizedTest
    @ValueSource(ints = {-1, 0, -2})
    void 로또_번호는_1이상_이어야_합니다(int input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusLotto(input))
                .withMessageContaining(DomainExceptionCode.LOTTO_NUMBER_IS_GREATER_THAN_MIN_SIZE.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {46, 47})
    void 로또_번호는_45이하_입니다(int input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusLotto(input))
                .withMessageContaining(DomainExceptionCode.LOTTO_NUMBER_IS_LESS_THAN_MAX_SIZE.getMessage());
    }

}