package lotto.view.core;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public final class InputView extends ConsoleWriter {

    public int readPurchasePrice() {
        this.println("구입금액을 입력해 주세요.");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException("에러");
        }
    }

    public List<Integer> readAnswerLottoNumber() {
        this.println("당첨 번호를 입력해 주세요.");
        try {
            return Arrays.stream(Console.readLine().split(","))
                    .map(Integer::parseInt)
                    .toList();
        } catch (Exception exception) {
            throw new IllegalArgumentException("에러");
        }
    }

    public int readBonusNumber() {
        this.println("보너스 번호를 입력해 주세요.");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException("에러");
        }
    }
}
