package lotto.component;

import lotto.event.EventListener;
import lotto.event.RegisterAnswerLottoEvent;
import lotto.view.InputView;

public record RegisterAnswerLottoComponent(InputView inputView, EventListener eventListener) implements Component {

    @Override
    public void render() {
        eventListener.listenWithParameter(RegisterAnswerLottoEvent::new)
                .accept(inputView.readAnswerLottoNumber());
    }
}
