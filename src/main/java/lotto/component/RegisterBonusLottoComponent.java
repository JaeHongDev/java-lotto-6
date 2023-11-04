package lotto.component;

import lotto.event.EventListener;
import lotto.event.RegisterBonusLottoEvent;
import lotto.view.InputView;

public record RegisterBonusLottoComponent(InputView inputView, EventListener eventListener) implements Component {
    @Override
    public void render() {
        eventListener.listenWithParameter(RegisterBonusLottoEvent::new)
                .accept(inputView.readBonusLottoNumber());
    }
}
