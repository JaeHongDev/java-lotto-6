package lotto.state;

import java.util.Map;
import java.util.stream.Collectors;
import lotto.core.LottoMatchingTable;

public record LottoMatchResultState(Map<LottoMatchingTable, Integer> state, int payment) {

    private static final String MATCH_FORMAT = "%s - %d개";

    public String toResult() {
        return state.entrySet()
                .stream().map(entry -> String.format(MATCH_FORMAT, entry.getKey().toText(), entry.getValue()))
                .collect(Collectors.joining("\n"));
    }

    public String toROI() {
        final var totalInvestment = state.entrySet()
                .stream().mapToInt(entry -> entry.getKey().getReward() * entry.getValue())
                .sum();

        return String.valueOf(((double) totalInvestment / payment) * 100);
    }

}
