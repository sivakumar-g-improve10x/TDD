package scoring;

public class Scoring {

    public int[] calculateScore(String score) {
        if (score.equals("A")){
            return new int[]{1,0,0};
        }
        return new int[3];
    }
}
