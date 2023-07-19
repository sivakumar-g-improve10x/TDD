package scoring;

public class Scoring {

    public int[] calculateScore(String score) {
        int[] scores = new int[3];
        for (int i = 0; i < score.length(); i++) {
            char c = score.charAt(i);
            if (c == 'A') {
                scores[0] = 1;
            } else if (c == 'B') {
                scores[1] = 1;
            } else if (score.equals("C")) {
                return new int[]{0, 0, 1};
            }
        }
        return scores;
    }
}