package lotto.view.component;

import lotto.event.EventListener;
import lotto.view.core.Component;
import lotto.view.core.OutputView;

public record WinningStatisticsComponent(OutputView outputView, EventListener eventListener) implements Component {
    @Override
    public void render() {

        outputView.printResult();
    }
}
