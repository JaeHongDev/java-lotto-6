package lotto.component;

import java.util.List;
import lotto.event.EventListener;
import lotto.state.PaymentSummaryState;
import lotto.state.PaymentSummaryState.MatchResult;
import lotto.view.OutputView;

public record PaymentSummaryComponent(OutputView outputView, EventListener eventListener) implements Component {
    @Override
    public void render() {
        final var paymentSummaryState = new PaymentSummaryState(List.of(
                new MatchResult(3, false, 5_000, 1),
                new MatchResult(4, false, 50_000, 0),
                new MatchResult(5, false, 1_500_000, 0),
                new MatchResult(5, true, 30_000_000, 0),
                new MatchResult(6, false, 200_000_000, 0)
        ), 62.5);

        outputView.printPaymentSummaryState(paymentSummaryState);

    }
}
