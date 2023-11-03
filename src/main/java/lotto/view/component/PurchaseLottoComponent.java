package lotto.view.component;

import java.util.List;
import lotto.event.EventListener;
import lotto.state.PurchasedLotto;
import lotto.state.PurchasedLotto.Lotto;
import lotto.view.core.Component;
import lotto.view.core.InputView;
import lotto.view.core.OutputView;

public record PurchaseLottoComponent(InputView inputView, OutputView outputView, EventListener eventListener) implements Component {

    @Override
    public void render() {
        inputView.readPurchasePrice();
        final var purchasedLotto = new PurchasedLotto(List.of(
                new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                new Lotto(List.of(1, 2, 3, 4, 5, 6))
        ));
        outputView.printPurchasedLotto(purchasedLotto);
    }
}
