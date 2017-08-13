/**
 * Created by rmhedge on 8/12/17.
 */
public class TerriblePlayer implements Player {

    @Override
    public Choice makeChoice() {
        return Choice.PAPER;
    }
}
