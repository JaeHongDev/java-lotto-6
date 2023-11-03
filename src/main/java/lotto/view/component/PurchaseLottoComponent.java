package lotto.view.component;

import lotto.event.EventListener;
import lotto.view.core.Component;
import lotto.view.core.InputView;

public record PurchaseLottoComponent(InputView inputView, EventListener eventListener) implements Component {

    @Override
    public void render() {
        inputView.readPurchasePrice();

    }
}
