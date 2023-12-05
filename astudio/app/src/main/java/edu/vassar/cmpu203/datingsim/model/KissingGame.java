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

    public String getResult(boolean result){
        String outcome = "";
        if(result){
            outcome = "Congrats! You won! Hope you're having fun, lets play some more! :)";
        }
        else{
            outcome = "Oh no! :( You got caught three times. Better luck next time around :,(";
        }
        return outcome;
    }
    @Override //returns the affection points
    public int getPoints(boolean result) {
        if(result){
            return 5;
        }
            else{
                return 1;
        }
    }

}
