package lotto.component;

import lotto.event.EventListener;
import lotto.event.StaticsLottoEvent;
import lotto.view.OutputView;

public record StaticsLottoComponent(OutputView outputView, EventListener eventListener) implements Component {
    @Override
    public void render() {
        outputView.printStatics(eventListener.listenWithResult(StaticsLottoEvent::new));
    }
}
