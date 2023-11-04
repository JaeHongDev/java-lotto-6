package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public final class InputView extends ConsoleWriter {
    public int readPurchasePrice() {
        this.println("구입금액을 입력해 주세요.");
        return convertStringToInteger(Console.readLine());
    }

    private int convertStringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception exception) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> readAnswerLottoNumber() {
        this.newLine();
        this.println("당첨 번호를 입력해 주세요.");
        return Arrays.stream(Console.readLine().split(","))
                .map(this::convertStringToInteger)
                .toList();
    }
}
