package lotto.view.core;

import java.util.List;
import java.util.stream.Stream;
import lotto.event.EventListener;
import lotto.view.component.PurchaseLottoComponent;
import lotto.view.component.RegisterAnswerLottoComponent;
import lotto.view.component.RegisterBonusNumberComponent;
import lotto.view.component.WinningStatisticsComponent;

public class ViewContainer {
    private final List<Component> components;

    public ViewContainer(InputView inputView, OutputView outputView, EventListener eventListener) {
        components = List.of(
                new PurchaseLottoComponent(inputView, outputView, eventListener),
                new RegisterAnswerLottoComponent(inputView, eventListener),
                new RegisterBonusNumberComponent(inputView, eventListener),
                new WinningStatisticsComponent(outputView, eventListener)
        );
    }


    public void renderAll() {
        components.forEach(component -> Stream.generate(component::isFail)
                .takeWhile((b) -> b)
                .forEach(b -> {
                    // ignore
                })
        );


    }


}
