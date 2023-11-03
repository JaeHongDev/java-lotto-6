package lotto.state;

import java.util.List;
import java.util.stream.Collectors;

public record PurchasedLotto(List<Lotto> purchasedLotto) {

    public String toResult() {
        return this.purchasedLotto.stream()
                .map(Lotto::toResult)
                .collect(Collectors.joining("\n"));
    }

    public record Lotto(List<Integer> numbers) {
        public String toResult() {
            return String.format("[%s]", numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }
}
