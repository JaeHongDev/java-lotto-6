package lotto.state;

import java.util.List;
import java.util.stream.Collectors;

public record PurchaseLottoResultState(List<Lotto> purchasedLotto) {

    public String toResult() {
        return purchasedLotto.stream()
                .map(Lotto::toResult)
                .collect(Collectors.joining("\n"));
    }

    public int size() {
        return this.purchasedLotto.size();
    }

    public record Lotto(List<Integer> lotto) {

        public String toResult() {
            return String.format("[%s]", lotto.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }
}
