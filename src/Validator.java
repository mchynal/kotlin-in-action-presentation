import java.util.function.Consumer;

public class Validator<T> {

    public void execute(Consumer<T> block) {
        block.accept((T) this);
    }

}