package lotto.component;

import lotto.event.EventListener;
import lotto.event.PurchaseLottoEvent;
import lotto.view.InputView;
import lotto.view.OutputView;

public record PurchaseLottoComponent(InputView inputView, OutputView outputView, EventListener eventListener) implements Component {


    @Override
    public void render() {
        final var purchaseLottoResultState = eventListener.listenWithParameterAndResult(PurchaseLottoEvent::new)
                .apply(inputView.readPurchasePrice());

        outputView.printPurchaseLotto(purchaseLottoResultState);
    }
}
