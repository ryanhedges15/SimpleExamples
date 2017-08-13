import java.util.Random;

/**
 * Created by rmhedge on 8/12/17.
 */
public class GoodPlayer implements Player {


    @Override
    public Choice makeChoice() {
        Random rand = new Random(System.currentTimeMillis());
        switch (rand.nextInt(3)) {
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
