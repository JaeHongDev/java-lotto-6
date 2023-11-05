package lotto.component;

import java.util.stream.Stream;
import lotto.event.EventListener;
import lotto.event.RegisterAnswerLottoEvent;
import lotto.view.InputView;

public record RegisterAnswerLottoComponent(InputView inputView, EventListener eventListener) implements Component {

    @Override
    public void render() {

        Stream.generate()
        eventListener.listenWithParameter(RegisterAnswerLottoEvent::new)
                .accept(inputView.readAnswerLottoNumber());
    }
}
