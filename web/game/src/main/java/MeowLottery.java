import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 */
public class MeowLottery {
    private List<String> participants = new ArrayList<>();
    private String winner;

    public void addParticipant(String name) {
        participants.add(name);
    }

    public String startLottery() {
        if (!participants.isEmpty()) {
            Random random = new Random();
            int winnerIndex = random.nextInt(participants.size());
            winner = participants.get(winnerIndex);
            return winner;
        }
        return null;
    }

    public String getWinner() {
        return winner;
    }
}
