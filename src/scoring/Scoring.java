package scoring;

public class Scoring {

    public int[] calculateScore(String score) {
        if (score.equals("A")){
            return new int[]{1,0,0};
        } else if (score.equals("B")) {
            return new int[]{0,1,0};
        } else if (score.equals("C")) {
            return new int[]{0,0,1};
        }
        return new int[3];
    }
}
