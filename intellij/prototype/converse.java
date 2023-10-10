import java.util.Scanner;

/**
 * Takes in the Player's moves and returns them back to be used in the game
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class Converse {
    String name;
    String location;

    public Converse (){

    }

    public boolean start(){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to our awesome amazing spectacular game!" +
                " It'll be the best game you've ever played :P" );
        System.out.println("Dearest Player, please enter your name:");
        String name = s.nextLine();
        this.name = name;
        System.out.println("Hello " + this.name);
    }

}