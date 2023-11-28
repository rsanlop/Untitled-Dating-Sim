package edu.vassar.cmpu203.datingsim.model;

public class TriviaGame implements IMiniGame {
    public int score = 0;

    @Override
    public String getInstructions() {
        return "null";
    }

    @Override
    public String getName() {
        return "Trivia";
    }

    @Override
    public int getResult() {
        return score;
    }

}
