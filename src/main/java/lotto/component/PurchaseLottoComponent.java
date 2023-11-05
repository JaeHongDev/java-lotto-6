package lotto.component;

import java.util.List;
import lotto.event.EventListener;
import lotto.state.PurchasedLottoState;
import lotto.view.InputView;
import lotto.view.OutputView;

public record PurchaseLottoComponent(InputView inputView, OutputView outputView, EventListener eventListener) implements Component {
    @Override
    public void render() {
        final var payment = inputView.readPaymentPrice();

        final var purchasedLottoState = new PurchasedLottoState(2, List.of(
                List.of(1, 2, 3, 4, 5, 6),
                List.of(6, 5, 4, 3, 2, 1)
        ));

        outputView.printPurchasedLottoState(purchasedLottoState);

    }
}
