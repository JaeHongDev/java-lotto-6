package lotto.view.core;

import camp.nextstep.edu.missionutils.Console;

public final class InputView extends ConsoleWriter {

    public int readPurchasePrice() {
        this.println("구입금액을 입력해 주세요.");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException("에러");
        }
    }
}
