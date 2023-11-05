package lotto.component;

import lotto.event.EventListener;
import lotto.view.InputView;

public record RegisterAnswerLottoComponent(InputView inputView, EventListener eventListener) implements Component {
    @Override
    public void render() {
        final var answerLotto = inputView.readAnswerLotto();
    }
}
