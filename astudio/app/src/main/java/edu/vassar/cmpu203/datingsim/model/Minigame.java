package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Minigame cLass that has a list of all the possible minigames
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/18/2023
 */

public class Minigame {
    private List<String> minigames = new ArrayList<>();

    public Minigame(){
        addToMinigame("Kissing Game");
        addToMinigame("Trivia Game");
        addToMinigame("Riddle Game");
    }
    public void addToMinigame(String minigame){
        this.minigames.add(minigame);
    }
    public String getMinigame(){
        Random rand = new Random();
        return minigames.get(rand.nextInt(minigames.size()));

    }
}