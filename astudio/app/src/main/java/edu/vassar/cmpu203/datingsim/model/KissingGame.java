package edu.vassar.cmpu203.datingsim.model;

public class KissingGame implements IMiniGame{
    @Override
    public String getInstructions() {
        String instructions = "Kissing Game Instructions: " +
                "The goal is to kiss your partner for as long as you can without getting caught. " +
                "The longer you kiss the more affection points you gain. If you get caught those points reset." +
                "To kiss simply press the screen! Good luck :)    *mwah* ;)";
        return instructions;
    }

    @Override
    public boolean getResult() {
        return false;
    }

    @Override
    public int getSuccess() {
        return 0;
    }

    @Override
    public int getFailure() {
        return 0;
    }
}
