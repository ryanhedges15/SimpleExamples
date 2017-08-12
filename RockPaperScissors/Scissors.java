
/**
 * Created by rmhedge on 8/11/17.
 */
public class Scissors implements GameObject {

    @Override
    public boolean beats(Rock rock) {
        return false;
    }

    @Override
    public boolean beats(Paper paper) {
        return true;
    }

    @Override
    public boolean beats(Scissors scissors) {
        return false;
    }
}
