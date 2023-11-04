package lotto.component;

import java.util.List;
import lotto.event.EventListener;
import lotto.state.PurchaseLottoResultState;
import lotto.state.PurchaseLottoResultState.Lotto;
import lotto.view.InputView;
import lotto.view.OutputView;

public record PurchaseLottoComponent(InputView inputView, OutputView outputView, EventListener eventListener) implements Component {


    @Override
    public void render() {
        final var price = inputView.readPurchasePrice();

        final var purchaseLottoResultState = new PurchaseLottoResultState(
                List.of(
                        new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                        new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                        new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                        new Lotto(List.of(1, 2, 3, 4, 5, 6))
                )
        );

        outputView.printPurchaseLotto(purchaseLottoResultState);
    }
}
