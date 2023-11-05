package lotto.state;

import java.util.EnumMap;
import lotto.core.LottoMatchingTable;
import org.junit.jupiter.api.Test;

class LottoMatchResultStateTest {


    @Test
    void 수익률_계산_테스트() {

        final var matchResult = new LottoMatchResultState(
                new EnumMap<>(LottoMatchingTable.class) {{
                    this.put(LottoMatchingTable.MATCH_6, 1);
                }}, 8000
        );

        System.out.println("======");
        System.out.println(matchResult.toResult());
        System.out.println(matchResult.toROI());

    }
}