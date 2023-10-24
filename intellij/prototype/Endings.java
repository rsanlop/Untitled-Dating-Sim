/**
 * Ending Screens
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/18/2023
 */

public class Endings {

    public Endings(){

    }
    public void getEnding(int affection){
        if (affection == 100){
            System.out.println("Phew, glad this is the case. Who even needs people? " +
                    "Am I right?");
        } else if (affection > 7) {//the number isnt set yet, this is just a random number
            System.out.println("Woohooo! Good ending! They like you too :)");
        }
        else{
            System.out.println("They don't like you... Damn, that sucks. Better luck next time ;)");
        }
    }
}