
/**
 * Created by rmhedge on 8/11/17.
 */
public class Rock implements GameObject {

    @Override
    public boolean beats(Rock rock) {
        return false;
    }

    @Override
    public boolean beats(Paper paper) {
        return false;
    }

    @Override
    public boolean beats(Scissors scissors) {
        return true;
    }
}
