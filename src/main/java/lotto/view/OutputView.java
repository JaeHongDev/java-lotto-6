package lotto.view;

import lotto.state.PurchaseLottoResultState;

public final class OutputView extends ConsoleWriter {
    public void printPurchaseLotto(PurchaseLottoResultState purchaseLottoResultState) {
        this.newLine();
        this.println(String.format("%d개를 구매했습니다.", purchaseLottoResultState.size()));
        this.println(purchaseLottoResultState.toResult());
    }
}
