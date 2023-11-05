package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("[도메인] 결제금액 ")
public class PaymentAmountTest {


    @Nested
    @DisplayName("생성 조건에서")
    class CreateTest {
        @ParameterizedTest
        @ValueSource(ints = {999, -1, 0})
        void _1000원_미만은_생성할_수_없습니다(final int input) {
            assertThatIllegalArgumentException()
                    .isThrownBy(() -> new PaymentAmount(input));
        }

        @ParameterizedTest
        @ValueSource(ints = {1001, 1111, 11111, 1111111})
        void _1000원으로_나누어_떨어지지_않으면_생성될_수_없습니다(final int input) {
            assertThatIllegalArgumentException()
                    .isThrownBy(() -> new PaymentAmount(input));
        }
    }

}