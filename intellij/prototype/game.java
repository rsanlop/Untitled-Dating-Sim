import java.util.Scanner;

/**
 * Game class that runs the game loop
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */
public class Game {
    Player player = new Player();
    Character zeus = new Character("Zeus", "Olympus", 0,
            {"*You see a swan. Not just any swan though. It's Zeus! He notices you walk up to the gates and greets you*" +
                    "Why hello there. You look... rather ravishing. *He whistles as he looks you up and down. (He likes" +
                    "what he sees.)* Oh, please excuse my disheveled form! *He waddles in a circle at lightning speed" +
                    "and poof. He's actually kind of ripped. (as a human)* I hope you like what YOU see. *He gives a smug" +
                    "look*"}
            );
    Character shruck = new Character("Shruck", "Swamp", 0,
            {"*You see a farty swamp the size of small house, right in front of a run-down tree house* *You see the door slam open" +
                    "and out walks a bumbling green figure.* YOU! *he says as he points his stubby finger in your direction* *He proceeds " +
                    "to stomp towards you.* WHAT ARE YOU DOING IN MY BLOODY SWAMP! *he bellows, as pieces of his stinky dinner fly out his" +
                    "mouth and onto your face.* DON'T TELL ME YOU WANT TO FART IN IT. BECAUSE LET ME TELL YOU. THE ONLY ONE WHO CAN FART IN" +
                    "MY BLOODY SWAMP IS MY BLOODY ARSE!" }


            );
    Character bonny = new Character("Bonny", "Freddy's Pizzeria", 0);
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



