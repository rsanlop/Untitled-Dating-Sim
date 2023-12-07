package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class RiddleGame implements  IMiniGame{
    public int score = 0;

    HashMap<String, HashMap<String, String>> allRiddles;
    

    @Override
    public String getInstructions() {
        String instructions = "?Riddle? Game Instructions: " +
                "The goal of this game is to solve the riddle! You'll have four" +
                " options and only one of them is right. Good luck! :)";
        return instructions;
    }

    @Override
    public String getName() {
        return "Riddle Game";
    }

    public String getResult(boolean result){
        String outcome = "";
        if(result){
            outcome = "Congrats! You won! What a smartie :P Hope you're having fun, lets play some more! :)";
        }
        else{
            outcome = "Oh no! :( You were so wrong. Better luck next time around :,(";
        }
        return outcome;
    }
    @Override //returns the points
    public int getPoints(boolean result) {
        if(result){
            return 5;
        }
        else{
            return 1;
        }
    }

}
