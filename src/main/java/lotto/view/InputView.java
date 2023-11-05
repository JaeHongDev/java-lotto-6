package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.function.Function;

public final class InputView extends ConsoleWriter {
    public int readPaymentPrice() {
        this.println("구입금액을 입력해 주세요.");
        return convertStringToInteger().apply("구입금액은 정수여야 합니다.");
    }

    private Function<String, Integer> convertStringToInteger() {
        return (message) -> {
            try {
                return Integer.parseInt(Console.readLine());
            } catch (Exception exception) {
                throw new IllegalArgumentException(message);
            }
        };
    }

}
