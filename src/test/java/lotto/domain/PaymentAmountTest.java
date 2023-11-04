package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import lotto.exception.DomainExceptionCode;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PaymentAmountTest {


    @ParameterizedTest
    @ValueSource(ints = {999, 0})
    void 구입금액은_1000원_보다_작을_수_없습니다(int input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new PaymentAmount(input))
                .withMessageContaining(DomainExceptionCode.PAYMENT_IS_GREATER_THAN_MIN_SIZE.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {1001, 10001, 12345, 123456})
    void 구입금액은_1000원으로_나누어_떨어져야_합니다(int input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new PaymentAmount(input))
                .withMessageContaining(DomainExceptionCode.PAYMENT_MUST_BE_DIVIDED.getMessage());
    }

}