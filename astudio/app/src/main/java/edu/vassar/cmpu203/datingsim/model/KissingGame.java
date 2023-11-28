package edu.vassar.cmpu203.datingsim.model;

public class KissingGame implements IMiniGame{

    public KissingGame(){}
    public int score;
    @Override
    public String getInstructions() {
        String instructions = "Kissing Game Instructions: " +
                "The goal is to kiss your partner for as long as you can without getting caught. " +
                "The longer you kiss the more affection points you gain. If you get caught those points reset." +
                "To kiss simply press the screen! Good luck :)    *mwah* ;)";
        return instructions;
    }
    public String getName(){
        return "Kissing Game";
    }

    @Override //returns the points
    public int getResult() {
        score++;
            return score;
    }

}
