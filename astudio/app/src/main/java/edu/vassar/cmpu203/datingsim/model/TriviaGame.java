package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TriviaGame implements IMiniGame {
    List<List<String>> allTrivia = new ArrayList<>();

    public TriviaGame(){
        List<String> triviaAnswers1 = new ArrayList<>();
        triviaAnswers1.add("What species of bird can fly backwards?");
        triviaAnswers1.add("Hummingbird");
        triviaAnswers1.add("Red Robin");
        triviaAnswers1.add("Canary");
        triviaAnswers1.add("Penguin");
        allTrivia.add(triviaAnswers1);
        List<String> triviaAnswers2 = new ArrayList<>();
        triviaAnswers2.add("How many times does Santa check his list?");
        triviaAnswers2.add("Twice");
        triviaAnswers2.add("Once");
        triviaAnswers2.add("Never");
        triviaAnswers2.add("Thrice");
        allTrivia.add(triviaAnswers2);
        List<String> triviaAnswers3 = new ArrayList<>();
        triviaAnswers3.add("What is the 5th decimal digit of pi?");
        triviaAnswers3.add("9");
        triviaAnswers3.add("4");
        triviaAnswers3.add("6");
        triviaAnswers3.add("5");
        allTrivia.add(triviaAnswers3);
        List<String> triviaAnswers4 = new ArrayList<>();
        triviaAnswers4.add("What is the world's most expensive spice");
        triviaAnswers4.add("Saffron");
        triviaAnswers4.add("Cumin");
        triviaAnswers4.add("Paprika");
        triviaAnswers4.add("All spice");
        allTrivia.add(triviaAnswers4);
        List<String> triviaAnswers5 = new ArrayList<>();
        triviaAnswers5.add("Scurvy is caused by a lack of this vitamin?");
        triviaAnswers5.add("Vitamin C");
        triviaAnswers5.add("Vitamin D");
        triviaAnswers5.add("Vitamin A");
        triviaAnswers5.add("Gummy Vitamins");
        allTrivia.add(triviaAnswers5);

    }

    public List<String> getTrivia(){
        Random rand = new Random();
        return allTrivia.get(rand.nextInt(allTrivia.size()));
    }


    @Override
    public String getInstructions() {
        String instructions = "Trivia Game Instructions: " +
                "The goal of this game is to pick the right Trivia answer! You'll have four" +
                " options and only one of them is right. Good luck, hope you know your stuff! :)";
        return instructions;
    }

    @Override
    public String getName() {
        return "Trivia Game";
    }

    public String getResult(boolean result){
        String outcome = "";
        if(result){
            outcome = "Congrats! You won! Dense brain alert :P Hope you're having fun, lets play some more! :)";
        }
        else{
            outcome = "Oh no! :( Brain fart, huh? Better luck next time around :,(";
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
