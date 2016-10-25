import java.util.function.Consumer;

public class Validator<T extends  Validator> {

    public void execute(Consumer<T> block) {
        block.accept((T) this);
    }

}