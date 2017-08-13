import java.util.regex.Pattern;

/**
 * Created by rmhedge on 8/12/17.
 */
public interface GameObject {

    boolean beats(Rock rock);
    boolean beats(Scissors scissors);
    boolean beats(Paper paper);
}
