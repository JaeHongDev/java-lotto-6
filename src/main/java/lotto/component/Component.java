package lotto.component;

public interface Component {
    void render();

    default boolean execute() {
        try {
            render();
            return true;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return false;
        }
    }
}
