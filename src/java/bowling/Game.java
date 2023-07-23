package bowling;

public class Game {
    private int[] rolls = new int[21];
    private int currentRollsIndex = 0;

    public void roll(int pins) {
        rolls[currentRollsIndex] = pins;
        currentRollsIndex++;
    }

    public int score() {
        int totalPins = 0;
        int firstInFrame = 0;
        for (int frame =0; frame<10;frame++){
            if (isStrike(rolls[firstInFrame])){
                totalPins += 10 + rolls[firstInFrame+1] + rolls[firstInFrame +2];
                firstInFrame++;
            } else if(isSpare(firstInFrame)){
                totalPins +=10 + firstInNextFrame(firstInFrame);
                firstInFrame +=2;
            }else {
                totalPins += rolls[firstInFrame] + rolls[firstInFrame+1];
                firstInFrame+=2;
            }
        }
        return totalPins;
    }

    private boolean isStrike(int rolls) {
        return rolls == 10;
    }

    private int firstInNextFrame(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private boolean isSpare(int firstInFrame) {
        return isStrike(rolls[firstInFrame] + rolls[firstInFrame + 1]);
    }
}
