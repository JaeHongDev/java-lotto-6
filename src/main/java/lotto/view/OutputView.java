package lotto.view;

import lotto.state.PurchaseLottoResultState;

public final class OutputView extends ConsoleWriter {
    public void printPurchaseLotto(PurchaseLottoResultState purchaseLottoResultState) {
        this.newLine();
        this.println(String.format("%d개를 구매했습니다.", purchaseLottoResultState.size()));
        this.println(purchaseLottoResultState.toResult());
    }

    public void printStatics() {
        this.newLine();
        this.println("""
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
}
