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
    public int getPoints(boolean result) {
        return 0;
    }

    @Override
    public String getResult(boolean result) {
        return "";
    }

}
