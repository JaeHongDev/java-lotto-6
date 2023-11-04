package lotto.component;

import lotto.event.EventListener;
import lotto.view.InputView;

public record RegisterBonusLottoComponent(InputView inputView, EventListener eventListener) implements Component {
    @Override
    public void render() {
        final var bonusNumber = inputView.readBonusLottoNumber();
    }
}
