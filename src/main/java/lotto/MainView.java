package lotto;

import lotto.event.EventListener;
import lotto.repository.LottoRepository;
import lotto.view.InputView;
import lotto.view.MainContainer;
import lotto.view.OutputView;

public class MainView {

    public void open() {
        new MainContainer(new InputView(), new OutputView(),
                new EventListener(new LottoRepository()))
                .renderAll();
    }
}
