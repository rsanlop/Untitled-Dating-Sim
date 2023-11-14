package edu.vassar.cmpu203.datingsim.model;

/**
 * Saves name of player.
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/12/2023
 */

public class Player{

    String name;

    int numDates;
    public Player(String name, int numDates){
        this.name = name;
        this.numDates = numDates;
    }

    public void setName(String name){
        this.name = name;
    }

        }