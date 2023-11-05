package lotto.state;

import java.util.List;

public record PurchasedLottoState(int count, List<List<Integer>> lottoBundle) {


    @Override
    public List<List<Integer>> lottoBundle() {
        return lottoBundle.stream()
                .map(lotto -> lotto.stream().sorted().toList())
                .toList();
    }

}
