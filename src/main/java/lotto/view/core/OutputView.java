package lotto.view.core;

import lotto.state.PurchasedLotto;

public final class OutputView extends ConsoleWriter {
    public void printError(String message) {
        println(message);
    }

    public void printResult() {
        println("""
                당첨 통계
                ---
                3개 일치 (5,000원) - 1개
                4개 일치 (50,000원) - 0개
                5개 일치 (1,500,000원) - 0개
                5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
                6개 일치 (2,000,000,000원) - 0개
                총 수익률은 62.5%입니다.
                """);
    }

    public void printPurchasedLotto(PurchasedLotto purchasedLotto) {
        newLine();
        println(purchasedLotto.toResult());
    }
}
