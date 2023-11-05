package lotto.state;

import java.util.List;

public record PaymentSummaryState(List<MatchResult> matchResults, double profitMargin) {

    public record MatchResult(int ballCount, boolean matchBonus, int reward, int numberOfMatch) {

    }
}
