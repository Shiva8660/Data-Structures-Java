package Queue14.LeetCode;

import java.util.Queue;
import java.util.LinkedList;

public class PartyVictoryPredictor6 {
    public static void main(String[] args) {
        SenateGame game = new SenateGame();
        String senate = "RDDRR";
        String result = game.predictWinner(senate);
        System.out.println(result);
    }
}

class SenateGame {
    public String predictWinner(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int length = senate.length();

        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R') radiant.add(i);
            else dire.add(i);
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            if (radiant.peek() < dire.peek()) radiant.add(length++);
            else dire.add(length++);
            radiant.poll();
            dire.poll();
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
