package edu.vassar.cmpu203.datingsim.model;

import android.media.Image;

import java.util.List;

/**
 * Character Class
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class Character {
    private String name;
    private String location;
    private int affection;
    private List<String> dialogue;
    private int imageId;

    private int numDates;

    public Character(){}

    public Character(String name, int affection, List<String> dialogue, int imageId, int numDates){
        this.name = name;
        this.affection = affection;
        this.dialogue = dialogue;
        this.imageId = imageId;
        this.numDates = numDates;
    }
    public String getName(){
        return name;
    }
    public String getAffection(){
        return "" + affection;
    }
    public int incAffection(){
        this.affection += 2;
        return affection;
    }
    public int getImageId(){
        return imageId;
    }

    public List<String> getDialogue() {
        return dialogue;
    }

    public int getNumDates(){return numDates;}
}