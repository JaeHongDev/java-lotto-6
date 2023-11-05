package lotto.core;

import java.util.Arrays;

//
//        당첨 통계
//        ---
//        3개 일치 (5,000원) - 1개
//        4개 일치 (50,000원) - 0개
//        5개 일치 (1,500,000원) - 0개
//        5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
//        6개 일치 (2,000,000,000원) - 0개
//        총 수익률은 62.5%입니다.
public enum LottoMatchingTable {
    MATCH_3(3, 5_000),
    MATCH_4(4, 50_000),
    MATCH_5(5, 1_500_000),
    MATCH_5_AND_BONUS(5, true, 30_000_000),
    MATCH_6(6, 2_000_000_000),
    ;

    private final int normalCount;
    private final boolean matchBonus;
    private final int reward;


    LottoMatchingTable(int normalCount, boolean matchBonus, int reward) {
        this.normalCount = normalCount;
        this.matchBonus = matchBonus;
        this.reward = reward;
    }

    LottoMatchingTable(int normalCount, int reward) {
        this.normalCount = normalCount;
        this.matchBonus = false;
        this.reward = reward;
    }


    public static LottoMatchingTable of(int normalCount, boolean matchBonus) {
        return Arrays.stream(LottoMatchingTable.values())
                .filter(lottoMatchRow -> lottoMatchRow.matchBonus == matchBonus && normalCount == lottoMatchRow.normalCount)
                .findAny()
                .orElse(null);
    }

    public int getNormalCount() {
        return normalCount;
    }

    public boolean isMatchBonus() {
        return matchBonus;
    }

    public int getReward() {
        return reward;
    }

    public String toText() {
        final var sb = new StringBuilder();
        sb.append(normalCount).append("개 일치");
        if (matchBonus) {
            sb.append(", 보너스 볼 일치");
        }
        return sb.append(" ").append("(").append(reward).append(")").toString();
    }


}
