/**
 * Created by rmhedge on 8/12/17.
 */
public class LessTerriblePlayer implements Player {

    private int counter = 0;

    @Override
    public Choice makeChoice() {
        counter++;
        switch (counter) {
            case 1:
                return Choice.PAPER;
            case 2:
                return Choice.ROCK;
            case 3:
                return Choice.SCISSORS;
        }
        return Choice.SCISSORS;
    }
}
