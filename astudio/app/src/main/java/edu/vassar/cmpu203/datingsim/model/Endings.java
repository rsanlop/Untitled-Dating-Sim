package edu.vassar.cmpu203.datingsim.model;

/**
 * Ending Screens
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/18/2023
 */

public class Endings {
    public Endings(){
    }
    public String getEnding(int affection){
        if (affection == 100){
            return (", phew. Glad this is the case. Who even needs people? " +
                    "Am I right?");
        } else if (affection > 50) {
            return (" , congrats! Woohooo! Good ending! They like you too :)");
        }
        else{
            return (" , oh no. They don't like you... Damn, that sucks. Better luck next time ;)");
        }
    }
}