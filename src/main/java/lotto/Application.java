package lotto;

import lotto.event.EventListener;
import lotto.repository.LottoRepository;
import lotto.view.core.InputView;
import lotto.view.core.OutputView;
import lotto.view.core.ViewContainer;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        new ViewContainer(new InputView(), new OutputView(),
                new EventListener(new LottoRepository()))
                .renderAll();
    }
}
