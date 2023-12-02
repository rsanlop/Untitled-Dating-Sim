package edu.vassar.cmpu203.datingsim.model;

public class RiddleGame implements  IMiniGame{
    public int score = 0;

    @Override
    public String getInstructions() {
        return "null";
    }

    @Override
    public String getName() {
        return "Riddle Game";
    }

    @Override
    public int getPoints(boolean result) {
        return 0;
    }

    @Override
    public String  getResult(boolean result) {
        return "score";
    }

}
