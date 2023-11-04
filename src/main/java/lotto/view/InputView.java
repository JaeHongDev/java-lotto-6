package lotto.view;

import camp.nextstep.edu.missionutils.Console;

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
}
