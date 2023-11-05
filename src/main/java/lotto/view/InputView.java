package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public final class InputView extends ConsoleWriter {
    public int readPaymentPrice() {
        this.println("구입금액을 입력해 주세요.");
        return convertStringToInteger(Console.readLine()).apply("구입금액은 정수여야 합니다.");
    }

    private Function<String, Integer> convertStringToInteger(final String input) {
        return (message) -> {
            try {
                return Integer.parseInt(input);
            } catch (Exception exception) {
                throw new IllegalArgumentException(message);
            }
        };
    }

    public List<Integer> readAnswerLotto() {
        this.newLine();
        this.println("당첨 번호를 입력해 주세요.");
        return convertStringToListInteger(Console.readLine()).apply("로또 번호는 정수여야 합니다.");
    }

    private Function<String, List<Integer>> convertStringToListInteger(final String input) {
        return (message) -> Arrays.stream(input.split(","))
                .map(this::convertStringToInteger)
                .map(stringIntegerFunction -> stringIntegerFunction.apply(message))
                .toList();
    }

    public int readBonusNumber() {
        this.newLine();
        this.println("보너스 번호를 입력해 주세요.");
        return convertStringToInteger(Console.readLine()).apply("보너스 번호는 정수여야 합니다.");

    }
}
