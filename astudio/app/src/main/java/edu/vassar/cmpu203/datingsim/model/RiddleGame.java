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
    public int  getResult() {
        return score;
    }

}
