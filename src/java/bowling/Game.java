package bowling;

public class Game {
    int totalPins = 0;
    public void roll(int pins) {
        totalPins += pins;
    }

    public int score() {
        return totalPins;
    }
}
