import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Game class that runs the game loop
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */
public class Game {


    public Game(){

    }

    public static void main (String [] args) {

        List<String> zeusd = new ArrayList<String>();
        zeusd.add("*You see a swan. Not just any swan though. It's Zeus! He notices you walk up to the gates and greets you*" +
                "Why hello there. You look... rather ravishing. *He whistles as he looks you up and down. (He likes" +
                "what he sees.)* Oh, please excuse my disheveled form! *He waddles in a circle at lightning speed" +
                "and poof. He's actually kind of ripped. (as a human)* I hope you like what YOU see. *He gives a smug" +
                "look*");
        Character zeus = new Character("Zeus", "Olympus", 0, zeusd);

        List<String> shruckd = new ArrayList<String>();
        shruckd.add("*You see a farty swamp the size of small house, right in front of a run-down tree house* *You see the door slam open" +
                "and out walks a bumbling green figure.* YOU! *he says as he points his stubby finger in your direction* *He proceeds " +
                "to stomp towards you.* WHAT ARE YOU DOING IN MY BLOODY SWAMP! *he bellows, as pieces of his stinky dinner fly out his" +
                "mouth and onto your face.* DON'T TELL ME YOU WANT TO FART IN IT. BECAUSE LET ME TELL YOU. THE ONLY ONE WHO CAN FART IN" +
                "MY BLOODY SWAMP IS MY BLOODY ARSE!" );
        Character shruck = new Character("Shruck", "Swamp", 0, shruckd);

        List<String> bonnyd = new ArrayList<String>();
        bonnyd.add("You appear at an abandoned Pizzeria, that eerily feels familiar. As you pass through the rickety doors you sense" +
                "that you are not alone. There's a stage, with one purple character, that seems to be where the old mascots would perform. " +
                "It's eyes light up as it stares at you. You approach it without knowing why. Then it starts to walk towards you. " +
                "As it holds out it's hands it says 'Pizza?' in a slow robotic voice. You look at the hands and there is no pizza :(. " +
                "Afraid of what will happen if you refuse you take the fake pizza and pretend to eat it. After seeing you play along " +
                "the purple animatronic looks and you and slowly says 'Bonny'." );
        Character bonny = new Character("Bonny", "Freddy's Pizzeria", 0, bonnyd);

        List<String> satand = new ArrayList<String>();
        satand.add("Immediately you feel the immense heat radiating all around you. There's no doubt you are in Hell. Satan stands before you in all her " +
                "sultry glory. She seductively catwalks over to you. 'Greetings, or should I say Hell-o.' She bats her eyes and tucks her hair behind her " +
                "ear proudly. She then says 'Pretty hot in here, right?' as she hold up a finger heart with flames coming out of it and then she can't help but " +
                "wink at you. 'Or maybe its just you' she says while pointing at you. You can only help but think Hell yea. ");
        Character satan = new Character("Satan", "Hell", 0, satand);

        List<String> jojosond = new ArrayList<String>();
        jojosond.add("You arrive in cosmopolitan Tokyo in the middle of the night. The neon lights surround you as you take a look around the alley. All of a sudden, someone " +
                "grapples you and tosses you to the ground. 'Who sent you?' the voice yells at you. You have no idea what's going on and just try to get out of their " +
                "hold. Much to your dismay you cannot escape. Luckily a car passes and lights up your face long enough for the black leather suit wearing assailant to realize you aren't a threat. " +
                "The red headed beauty releases you quickly and takes a step back. She apologizes as you dust yourself off. 'さようなら' she whispers as she leaps upwards" +
                " and disappears in the Tokyo skyline." );
        Character jojoson = new Character("Scarlet Jojoson", "Japan", 0, jojosond);

        List<String> emptyd= new ArrayList<String>();
        Character empty = new Character("", "", 100, emptyd);

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to our awesome amazing spectacular game!" +
                " It'll be the best game you've ever played :P");
        System.out.println("Dearest Player, please enter your name:");
        String name = s.nextLine();
        Player player = new Player("");
        player.name = name;
        System.out.println("Hello " + player.name);
        for (int i = 0; i < 11; i++){           //This for loop is the main loop for going on dates. It will loop a total of 10 times unless a player wants to stop
                                                //anytime after the third date.
            if (i > 3){
                System.out.println("Do you wish to keep going on dates? " +
                        "/n Enter Y for yes and N for no.");
                String answer = s.nextLine();
                if (answer.equals("N")){
                    break;
                }
            }

            System.out.println("The following is a map of locations, where you will meet your potential partners. " +
                    "Please enter the name of the location you want.");
            CharacterMap characterMap = new CharacterMap();
            characterMap.addToMap(zeus.location);
            characterMap.addToMap(shruck.location);
            characterMap.addToMap(bonny.location);
            characterMap.addToMap(satan.location);
            characterMap.addToMap(jojoson.location);
            characterMap.getMap();
            String locationInput = s.nextLine();

            String intro = "You have chosen... ";

            Character choice = new Character();

            switch (locationInput) {
                case "Swamp":
                    System.out.println(intro + shruck.name);
                    System.out.println(shruck.dialogue.get(0));
                    choice = shruck;
                    break;
                case "Olympus":
                    System.out.println(intro + zeus.name);
                    System.out.println(zeus.dialogue.get(0));
                    choice = zeus;
                    break;
                case "Freddy's Pizzeria":
                    System.out.println(intro + bonny.name);
                    System.out.println(bonny.dialogue.get(0));
                    choice = bonny;
                    break;
                case "Hell":
                    System.out.println(intro + satan.name);
                    System.out.println(satan.dialogue.get(0));
                    choice = satan;
                    break;
                case "Japan":
                    System.out.println(intro + jojoson.name);
                    System.out.println(jojoson.dialogue.get(0));
                    choice = jojoson;
            }
            System.out.println("Now its time for a mini-game! Yay!" +
                    " /n ");

            Minigame games = new Minigame();
            games.addToMinigame("Kissing Game");
            games.addToMinigame("Trivia Game");
            games.addToMinigame("Riddle Game");
            games.getMinigame();

            choice.affection ++;    //currently we have no games coded but for the final version the amount of points gained or lost would depend on the minigame
                                    //result. There would also be a good or bad ending displayed accordingly.
            System.out.println("Woo, that was such a good game, right? Anyways another date?");
        }
            System.out.println("Now its time to make the final decision. Who has your heart? /n " +
                    "Is it Zeus? Shruck? Bonny? Satan? Scarlet Jojoson? Or perhaps, it's no one?" +
                    "/n Enter the name of a character or press enter if none");

            String decisionInput = s.nextLine();
            Character decision = new Character();
            String ending = "You have chosen... ";

            switch (decisionInput) {
                 case "Shruck":
                    System.out.println(ending + shruck.name);
                    decision = shruck;
                    break;
                case "Zeus":
                    System.out.println(ending + zeus.name);
                    decision = zeus;
                    break;
                case "Bonny":
                    System.out.println(ending + bonny.name);
                    decision = bonny;
                    break;
                case "Satan":
                    System.out.println(ending + satan.name);
                    decision = satan;
                    break;
                case "Scarlet Jojoson":
                    System.out.println(ending + jojoson.name);
                    decision = jojoson;
                }

            System.out.println(ending + decisionInput);

            Endings endings = new Endings();
            endings.getEnding(decision.affection);
            System.out.println("Thanks for playing! :D");

    }

}



