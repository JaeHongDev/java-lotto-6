package lotto.component;

import lotto.event.EventListener;
import lotto.view.InputView;

public record RegisterBonusNumberComponent(InputView inputView, EventListener eventListener) implements Component {

    @Override
    public void render() {
        final var bonusNumber = inputView.readBonusNumber();
        
    }
}
