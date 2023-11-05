package lotto.event;

import java.util.function.Consumer;
import java.util.function.Function;
import lotto.repository.LottoRepository;

public record EventListener(LottoRepository lottoRepository) {

    public void listen(Function<LottoRepository, Event> eventConstructor) {
        eventConstructor.apply(lottoRepository).execute();
    }

    public <T> Consumer<T> listenWithParameter(Function<LottoRepository, ParameterEvent<T>> eventConstructor) {
        return (input) -> eventConstructor.apply(lottoRepository).execute(input);
    }

    public <R> R listenWithReturn(Function<LottoRepository, ReturnEvent<R>> eventConstructor) {
        return eventConstructor.apply(lottoRepository).execute();
    }

    public <T, R> Function<T, R> listenWithParameterAndReturn(Function<LottoRepository, ParameterAndReturnEvent<T, R>> eventConsturcotr) {
        return (input) -> eventConsturcotr.apply(lottoRepository).execute(input);
    }


    public interface Event {
        void execute();
    }

    public interface ParameterEvent<T> {
        void execute(T input);
    }

    public interface ReturnEvent<R> {
        R execute();
    }

    public interface ParameterAndReturnEvent<T, R> {
        R execute(T input);
    }
}
