package lotto.state;

import java.util.List;
import java.util.stream.Collectors;

public record PurchaseLottoResultState(List<List<Integer>> purchasedLotto) {

    public String toResult() {
        return purchasedLotto.stream()
                .map(numbers -> numbers.stream().sorted().toList())
                .map(numbers -> String.format("[%s]", numbers.stream().map(String::valueOf).collect(Collectors.joining(", "))))
                .collect(Collectors.joining("\n"));
    }

    public int size() {
        return this.purchasedLotto.size();
    }

}
