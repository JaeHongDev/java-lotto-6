package lotto.view;

import java.util.stream.Collectors;
import lotto.state.PurchasedLottoState;

public final class OutputView extends ConsoleWriter {
    public void printPurchasedLottoState(PurchasedLottoState purchasedLottoState) {
        this.newLine();
        this.println(String.format("%d개를 구매했습니다.", purchasedLottoState.count()));
        this.println(purchasedLottoState.lottoBundle()
                .stream().map(lotto -> lotto.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")))
                .collect(Collectors.joining("\n")));

    }
}
