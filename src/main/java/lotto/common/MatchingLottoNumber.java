package lotto.common;

public enum MatchingLottoNumber {
    TREE_MATCH(3, 5_000),
    FOUR_MATCH(4, 50_000),
    FIVE_MATCH(5, 1_500_000),
    FIVE_MATCH_AND_BONUS(5, 30_000_000),
    SIX_MATCH(6, 2_000_000_000);

    private final int standardNumber;
    private final int price;

    MatchingLottoNumber(int standardNumber, int price) {
        this.standardNumber = standardNumber;
        this.price = price;
    }
}
