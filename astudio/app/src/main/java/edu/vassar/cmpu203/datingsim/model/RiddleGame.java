package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Random;

public class RiddleGame implements  IMiniGame{
    List<List<String>> allRiddles = new ArrayList<>();

    public RiddleGame(){
        List<String> riddleAnswers1 = new ArrayList<>();
        riddleAnswers1.add("Where does Friday come before Thursday?");
        riddleAnswers1.add("In the dictionary");
        riddleAnswers1.add("In the week");
        riddleAnswers1.add("In Space");
        riddleAnswers1.add("It just doesn't");
        allRiddles.add(riddleAnswers1);
        List<String> riddleAnswers2 = new ArrayList<>();
        riddleAnswers2.add("What two things can you never eat for breakfast?");
        riddleAnswers2.add("Lunch and dinner");
        riddleAnswers2.add("Steak and cheese");
        riddleAnswers2.add("Hands and knees");
        riddleAnswers2.add("You can eat anything");
        allRiddles.add(riddleAnswers2);
        List<String> riddleAnswers3 = new ArrayList<>();
        riddleAnswers3.add("What building has the most stories?");
        riddleAnswers3.add("The library");
        riddleAnswers3.add("Empire State Building");
        riddleAnswers3.add("Burj Khalifa");
        riddleAnswers3.add("Heaven");
        allRiddles.add(riddleAnswers3);
        List<String> riddleAnswers4 = new ArrayList<>();
        riddleAnswers4.add("What gets shorter as it grows older?");
        riddleAnswers4.add("A candle");
        riddleAnswers4.add("A flower");
        riddleAnswers4.add("A fruit");
        riddleAnswers4.add("Thoughts");
        allRiddles.add(riddleAnswers4);
        List<String> riddleAnswers5 = new ArrayList<>();
        riddleAnswers5.add("What has many keys but cannot open a single lock?");
        riddleAnswers5.add("A piano");
        riddleAnswers5.add("A bad janitor");
        riddleAnswers5.add("A keychain");
        riddleAnswers5.add("I don't know");
        allRiddles.add(riddleAnswers5);

    }

    public List<String> getRiddle(){
        Random rand = new Random();
        return allRiddles.get(rand.nextInt(allRiddles.size()));
    }


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
