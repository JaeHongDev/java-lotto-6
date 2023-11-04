package lotto.domain;

import java.util.List;

public record PurchasedLottoBundle(List<Lotto> purchasedLottoBundle) {
    public List<List<Integer>> toNumbers() {
        return purchasedLottoBundle.stream()
                .map(Lotto::getNumbers)
                .toList();
    }
}
