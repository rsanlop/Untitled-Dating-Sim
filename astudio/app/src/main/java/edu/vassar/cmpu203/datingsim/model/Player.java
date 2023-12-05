package edu.vassar.cmpu203.datingsim.model;

/**
 * Saves name of player.
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/12/2023
 */

public class Player{

    private String name;

    private int numDates = 0;
    public Player(String name){
        this.name = name;
    }
    public Player(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumDates(){
        return numDates;
    }

    public void incNumDates(){numDates++;}

}