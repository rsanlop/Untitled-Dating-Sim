import java.util.Scanner;

/**
 * Game class that runs the game loop
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */
public class Game {

    Character zeus = new Character("Zeus", "Olympus", 0);
    Character shruck = new Character("Shruck", "Swamp", 0);
    Character bonny = new Characrer("Bonny", "Freddy's Pizzeria", 0);
    Character satan = new Character("Satan", "Hell", 0);
    Character jojoson = new Character("Scarlet Jojoson", "Japan", 0);

    public static void main (String [] args){

            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to our awesome amazing spectacular game!" +
                    " It'll be the best game you've ever played :P" );
            System.out.println("Dearest Player, please enter your name:");
            String name = s.nextLine();
            this.name = name;
            System.out.println("Hello " + this.name);
    }

}



