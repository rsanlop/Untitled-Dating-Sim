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

    public Character(){}

    public Character(String name, String location, int affection, List<String> dialogue, int imageId){
        this.name = name;
        this.location = location;
        this.affection = affection;
        this.dialogue = dialogue;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
    public int getAffection(){
        return affection;
    }
    public int setAffection(int affection){
        this.affection = affection;
        return affection;
    }
    public int getImageId(){
        return imageId;
    }

    public List<String> getDialogue() {
        return dialogue;
    }
}