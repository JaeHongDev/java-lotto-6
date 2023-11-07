package lotto.domain.constant;

public enum LottoNumberConstant {
    LOTTO_SIZE(6),
    LOTTO_NUMBER_MIN_SIZE(1),
    LOTTO_NUMBER_MAX_SIZE(6);
    private final int number;

    LottoNumberConstant(int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public boolean isEqualTo(int input) {
        return this.number == input;
    }

    public boolean isNotEqualTo(int input) {
        return !isEqualTo(input);
    }

}
