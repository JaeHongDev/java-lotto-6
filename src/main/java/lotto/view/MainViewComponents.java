package lotto.view;

import java.util.List;
import lotto.component.Component;
import lotto.component.PurchaseLottoComponent;
import lotto.component.RegisterAnswerLottoComponent;
import lotto.event.EventListener;

public class MainViewComponents {

    private final List<Component> components;

    public MainViewComponents(InputView inputView, OutputView outputView, EventListener eventListener) {
        this.components = List.of(
                new PurchaseLottoComponent(inputView, outputView, eventListener),
                new RegisterAnswerLottoComponent(inputView, eventListener)
        );
    }

    public void renderAll() {
        components.forEach(Component::render);
    }
}
