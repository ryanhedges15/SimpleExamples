import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by rmhedge on 8/12/17.
 */
public class MainClass {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new TerriblePlayer());
        players.add(new LessTerriblePlayer());
        players.add(new OkPlayer());
        players.add(new GoodPlayer());

        Random random = new Random(System.currentTimeMillis());
        int index1 = random.nextInt(players.size()-1);
        int index2 = random.nextInt(players.size()-1);

        Player player1 = players.get(index1);
        Player player2 = players.get(index2);

        for(int i=0;i<10;i++) {
            Choice p1 = player1.makeChoice();
            Choice p2 = player2.makeChoice();

            System.out.println("Player 1 chose:"+p1+" Player 2 chose:"+p2);
        }

    }

}
