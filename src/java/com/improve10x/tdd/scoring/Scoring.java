package com.improve10x.tdd.scoring;

public class Scoring {

    public int[] calculateScore(String score) {
        int[] scores = new int[3];
        for (int i = 0; i < score.length(); i++) {
            char c = score.charAt(i);
            if (c == 'A') {
                scores[0]++;
            } else if (c == 'B') {
                scores[1]++;
            } else if (c == 'C') {
                scores[2]++;
            }
        }
        return scores;
    }
}