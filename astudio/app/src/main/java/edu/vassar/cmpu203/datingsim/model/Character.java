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
    private int affection;
    private List<String> dialogue;
    private int imageId;
    private int numDates;
    private int mainImageId;
    private int mainImageKissId;
    private int smallImageId;
    private int bigImageId;

    private int smallFrontImageId;
    private int smallRightImageId;

    public Character(){}

    public Character(String name, int affection, List<String> dialogue, int imageId, int numDates,
                     int mainImageId, int mainImageKissId, int smallImageId, int smallFrontImageId, int smallRightImageId, int bigImageId){
        this.name = name;
        this.affection = affection;
        this.dialogue = dialogue;
        this.imageId = imageId;
        this.numDates = numDates;
        this.mainImageId = mainImageId;
        this.mainImageKissId = mainImageKissId;
        this.smallImageId = smallImageId;
        this.bigImageId = bigImageId;
        this.smallFrontImageId = smallFrontImageId;
        this.smallRightImageId = smallRightImageId;

    }
    public String getName(){
        return name;
    }
    public String getAffection(){
        return "" + affection;
    }
    public int incAffection(int points){
        this.affection += points;
        return affection;
    }
    public int getImageId(){
        return imageId;
    }
    public int getMainImageId(){
        return mainImageId;
    }
    public int getMainImageKissId(){
        return mainImageKissId;
    }
    public int getSmallImageId(){
        return smallImageId;
    }
    public int getSmallFrontImageId(){
        return smallFrontImageId;
    }
    public int getSmallRightImageId(){
        return smallRightImageId;
    }
    public int getBigImageId(){
        return bigImageId;
    }
    public List<String> getDialogue() {
        return dialogue;
    }

    public int getNumDates(){return numDates;}
    public int incNumDates(){
        numDates++;
        return numDates;
    }
}