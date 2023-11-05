package lotto.view;

import java.util.List;
import lotto.component.Component;
import lotto.component.PurchaseLottoComponent;
import lotto.component.RegisterAnswerLottoComponent;
import lotto.component.RegisterBonusLottoComponent;
import lotto.component.StaticsLottoComponent;
import lotto.event.EventListener;

public class MainContainer {
    private final List<Component> components;

    public MainContainer(InputView inputView, OutputView outputView, EventListener eventListener) {
        components = List.of(
                new PurchaseLottoComponent(inputView, outputView, eventListener),
                new RegisterAnswerLottoComponent(inputView, eventListener),
                new RegisterBonusLottoComponent(inputView, eventListener),
                new StaticsLottoComponent(outputView, eventListener)
        );
    }


    public void renderAll() {
        components.forEach(Component::render);
    }


}
