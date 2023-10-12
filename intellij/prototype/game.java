import java.util.Scanner;

/**
 * Game class that runs the game loop
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */
public class Game {
    Player player = new Player();
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
            player.name = name;
            System.out.println("Hello " + player.name);
            System.out.println("The following is a map of locations, where you will meet your potential partners. " +
                            "Please enter the name of the location you want.");
            map.getMap();
            String locationInput = s.nextLine();

            String intro = "You have chosen... ";

            Character choice;

        switch(locationInput) {
            case shruck.location:
                System.out.println(intro + shruck.name);
                choice = shruck;
                break;
            case zeus.location:
                System.out.println(intro + zeus.name);
                choice = zeus;
                break;
            case bonny.location:
                System.out.println(intro + bonny.name);
                choice = bonny;
                break;
            case satan.location:
                System.out.println(intro + satan.name);
                choice = satan;
                break;
            case jojoson.location:
                System.out.println(intro + jojoson.name);
                choice = jojoson;
        }



    }

}



