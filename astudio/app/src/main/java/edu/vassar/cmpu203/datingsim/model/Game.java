package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Game class that runs the game loop
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */
/*
public class Game {
    List<String> zeusd = new ArrayList<String>();
    Character zeus = new Character("Zeus", "Olympus", 0, zeusd);


    List<String> shruckd = new ArrayList<String>();
    Character shruck = new Character("Shruck", "Swamp", 0, shruckd);

    List<String> bonnyd = new ArrayList<String>();
    Character bonny = new Character("Bonny", "Freddy's Pizzeria", 0, bonnyd);

    List<String> satand = new ArrayList<String>();
    Character satan = new Character("Satan", "Hell", 0, satand);


    List<String> jojosond = new ArrayList<String>();
    Character jojoson = new Character("Scarlet Jojoson", "Japan", 0, jojosond);
    List<String> emptyd= new ArrayList<String>();
    Character empty = new Character("", "", 100, emptyd);


    public Game(){
        zeusd.add("You see a swan. Not just any swan though. It's Zeus! He notices you walk up to the gates and greets you" + "\n" +
                "'Why hello there. You look... rather ravishing.' He whistles as he looks you up and down. (He likes" + "\n" +
                "what he sees.) 'Oh, please excuse my disheveled form!' He waddles in a circle at lightning speed" + "\n" +
                "and poof. He's actually kind of ripped. (as a human) 'I hope you like what YOU see.' He gives a smug" + "\n" +
                "look");



        shruckd.add("You see a farty swamp the size of small house, right in front of a run-down tree house. You see the door slam open" + "\n" +
                "and out walks a bumbling green figure. 'YOU!' he says as he points his stubby finger in your direction. He proceeds " + "\n" +
                "to stomp towards you. 'WHAT ARE YOU DOING IN MY BLOODY SWAMP!' he bellows, as pieces of his stinky dinner fly out his" + "\n" +
                "mouth and onto your face. 'DON'T TELL ME YOU WANT TO FART IN IT. BECAUSE LET ME TELL YOU. THE ONLY ONE WHO CAN FART IN" + "\n" +
                "MY BLOODY SWAMP IS MY BLOODY ARSE!'" );


        bonnyd.add("You appear at an abandoned Pizzeria, that eerily feels familiar. As you pass through the rickety doors you sense" + "\n" +
                "that you are not alone. There's a stage, with one purple character, that seems to be where the old mascots would perform. " + "\n" +
                "It's eyes light up as it stares at you. You approach it without knowing why. Then it starts to walk towards you. " + "\n" +
                "As it holds out it's hands it says 'Pizza?' in a slow robotic voice. You look at the hands and there is no pizza :(. " + "\n" +
                "Afraid of what will happen if you refuse, you take the fake pizza and pretend to eat it. After seeing you play along " + "\n" +
                "the purple animatronic looks and you and slowly says 'Bonny'." );



        satand.add("Immediately you feel the immense heat radiating all around you. There's no doubt you are in Hell. Satan stands before you in all her " + "\n" +
                "sultry glory. She seductively catwalks over to you. 'Greetings, or should I say Hell-o.' She bats her eyes and tucks her hair behind her " + "\n" +
                "ear proudly. She then says 'Pretty hot in here, right?' as she hold up a finger heart with flames coming out of it and then she can't help but " + "\n" +
                "wink at you. 'Or maybe its just you' she says while pointing at you. You can only help but think Hell yea. ");


        jojosond.add("You arrive in cosmopolitan Tokyo in the middle of the night. The neon lights surround you as you take a look around the alley. All of a sudden, someone " + "\n" +
                "grapples you and tosses you to the ground. 'Who sent you?' the voice yells at you. You have no idea what's going on and just try to get out of their " + "\n" +
                "hold. Much to your dismay you cannot escape. Luckily a car passes and lights up your face long enough for the black leather suit wearing assailant to realize you aren't a threat. " + "\n" +
                "The red headed beauty releases you quickly and takes a step back. She apologizes as you dust yourself off. 'さようなら' she whispers as she leaps upwards" + "\n" +
                "and disappears in the Tokyo skyline." );



    }
   public void makeCharacterMap(){
        CharacterMap characterMap = new CharacterMap();
        characterMap.addToMap(zeus.location);
        characterMap.addToMap(shruck.location);
        characterMap.addToMap(bonny.location);
        characterMap.addToMap(satan.location);
        characterMap.addToMap(jojoson.location);
        characterMap.getMap();
   }




    public void getCharacter(String location){
        Character choice = new Character();

        switch (location) {
            case "Swamp":
                System.out.println(shruck.name);
                System.out.println("\n");
                System.out.println(shruck.dialogue.get(0));
                choice = shruck;
                break;
            case "Olympus":
                System.out.println(zeus.name);
                System.out.println("\n");
                System.out.println(zeus.dialogue.get(0));
                choice = zeus;
                break;
            case "Freddy's Pizzeria":
                System.out.println(bonny.name);
                System.out.println("\n");
                System.out.println(bonny.dialogue.get(0));
                choice = bonny;
                break;
            case "Hell":
                System.out.println(satan.name);
                System.out.println("\n");
                System.out.println(satan.dialogue.get(0));
                choice = satan;
                break;
            case "Japan":
                System.out.println(jojoson.name);
                System.out.println("\n");
                System.out.println(jojoson.dialogue.get(0));
                choice = jojoson;
        }
        choice.affection ++;    //currently we have no games coded but for the final version the amount of points gained or lost would depend on the minigame
        //result. There would also be a good or bad ending displayed accordingly.

    }

    public void getFinalCharacter(String name){
        Character decision = new Character();

        switch (name) {
            case "Shruck":
                System.out.println(shruck.name);
                decision = shruck;
                break;
            case "Zeus":
                System.out.println(zeus.name);
                decision = zeus;
                break;
            case "Bonny":
                System.out.println(bonny.name);
                decision = bonny;
                break;
            case "Satan":
                System.out.println(satan.name);
                decision = satan;
                break;
            case "Scarlet Jojoson":
                System.out.println(jojoson.name);
                decision = jojoson;
                break;
            case ""    :
                System.out.println("No one");
                decision = empty;
        }
        Endings endings = new Endings();
        endings.getEnding(decision.affection);
    }
}



*/
