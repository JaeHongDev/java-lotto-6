package lotto.domain;

import java.util.HashSet;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }


    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    public List<Integer> getNumbers() {
        return numbers;
    }

    public boolean hasNumber(int bonusNumber) {
        return this.numbers.contains(bonusNumber);
    }


    public int matchCount(Lotto otherLotto) {
        final var compareLotto = new HashSet<>(this.numbers);
        compareLotto.addAll(otherLotto.numbers);

        // 1 2 3 4 5 6
        // 1 2 3 4 5 6
        // 6

        // 1 2 3 4 5 6
        // 7 8 9 10 11 12
        // 12
        return 12 - compareLotto.size();
    }
}
