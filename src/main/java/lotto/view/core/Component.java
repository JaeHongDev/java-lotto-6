package lotto.view.core;

public interface Component {
    void render();

    default boolean isFail() {
        try {
            render();
            return false;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return true;
        }
    }
}
