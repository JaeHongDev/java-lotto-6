package lotto.view;

import java.util.stream.Collectors;
import lotto.state.PaymentSummaryState;
import lotto.state.PaymentSummaryState.MatchResult;
import lotto.state.PurchasedLottoState;

public final class OutputView extends ConsoleWriter {
    private String getFormat(MatchResult matchResult) {
        if (matchResult.ballCount() == 5 && matchResult.matchBonus()) {
            return "%d개 일치, 보너스 볼 일치 (%d) - %d개";
        }
        return "%d개 일치 (%d) - %d개";
    }

    public void printPurchasedLottoState(PurchasedLottoState purchasedLottoState) {
        this.newLine();
        this.println(String.format("%d개를 구매했습니다.", purchasedLottoState.count()));
        this.println(purchasedLottoState.lottoBundle()
                .stream().map(lotto -> lotto.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")))
                .collect(Collectors.joining("\n")));

    }

    public void printPaymentSummaryState(PaymentSummaryState paymentSummaryState) {
        this.newLine();
        this.println("""
                당첨 통계
                ---
                """);
        this.println(paymentSummaryState.matchResults().stream()
                .map(matchResult -> String.format(
                        getFormat(matchResult),
                        matchResult.ballCount(),
                        matchResult.reward(),
                        matchResult.numberOfMatch())
                ).collect(Collectors.joining("\n")));
    }
}
