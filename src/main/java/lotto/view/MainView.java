package lotto.view;

import lotto.event.EventListener;
import lotto.repository.LottoRepository;

public class MainView {

    public void render() {
        new MainViewComponents(
                new InputView(),
                new OutputView(),
                new EventListener(new LottoRepository())
        ).renderAll();
    }
}
