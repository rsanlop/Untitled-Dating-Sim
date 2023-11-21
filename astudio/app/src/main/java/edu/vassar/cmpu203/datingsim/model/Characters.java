package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.controller.MainController;

/**
 * Map class which contains character's locations
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class Characters {

    public Character zeus;

    public Character shruck;

    public Character bonny;

    public Character satan;

    public Character jojoson;

    public Character alone;


    public Characters() {

        List<String> zeusd = new ArrayList<>();
        zeusd.add("You see a swan. Not just any swan though. It's Zeus! He notices you walk up to the gates and greets you" + "\n" +
                "'Why hello there. You look... rather ravishing.' He whistles as he looks you up and down. (He likes" + "\n" +
                "what he sees.) 'Oh, please excuse my disheveled form!' He waddles in a circle at lightning speed" + "\n" +
                "and poof. He's actually kind of ripped. (as a human) 'I hope you like what YOU see.' He gives a smug" + "\n" +
                "look");
        zeusd.add("Oh, welcome back %s.");
        zeusd.add("You just looove coming back~~ ;)");

        this.zeus = new Character("Zeus", 0, zeusd, R.drawable.zeusimage, 0);


        List<String> shruckd = new ArrayList<>();
        shruckd.add("You see a farty swamp the size of small house, right in front of a run-down tree house. You see the door slam open" + "\n" +
                "and out walks a bumbling green figure. 'YOU!' he says as he points his stubby finger in your direction. He proceeds " + "\n" +
                "to stomp towards you. 'WHAT ARE YOU DOING IN MY BLOODY SWAMP!' he bellows, as pieces of his stinky dinner fly out his" + "\n" +
                "mouth and onto your face. 'DON'T TELL ME YOU WANT TO FART IN IT. BECAUSE LET ME TELL YOU. THE ONLY ONE WHO CAN FART IN" + "\n" +
                "MY BLOODY SWAMP IS MY BLOODY ARSE!'");
        this.shruck = new Character("Shruck", 0, shruckd, R.drawable.shruckimage, 0);


        List<String> bonnyd = new ArrayList<>();
        bonnyd.add("You appear at an abandoned Pizzeria, that eerily feels familiar. As you pass through the rickety doors you sense" + "\n" +
                "that you are not alone. There's a stage, with one purple character, that seems to be where the old mascots would perform. " + "\n" +
                "It's eyes light up as it stares at you. You approach it without knowing why. Then it starts to walk towards you. " + "\n" +
                "As it holds out it's hands it says 'Pizza?' in a slow robotic voice. You look at the hands and there is no pizza :(. " + "\n" +
                "Afraid of what will happen if you refuse, you take the fake pizza and pretend to eat it. After seeing you play along " + "\n" +
                "the purple animatronic looks and you and slowly says 'Bonny'.");
        this.bonny = new Character("Bonny", 0, bonnyd, R.drawable.bonnyimage, 0);

        List<String> satand = new ArrayList<>();
        satand.add("Immediately you feel the immense heat radiating all around you. There's no doubt you are in Hell. Satan stands before you in all her " + "\n" +
                "sultry glory. She seductively catwalks over to you. 'Greetings, or should I say Hell-o.' She bats her eyes and tucks her hair behind her " + "\n" +
                "ear proudly. She then says 'Pretty hot in here, right?' as she hold up a finger heart with flames coming out of it and then she can't help but " + "\n" +
                "wink at you. 'Or maybe its just you' she says while pointing at you. You can only help but think Hell yea.");
        this.satan = new Character("Satan", 0, satand, R.drawable.satanimage, 0);


        List<String> jojosond = new ArrayList<>();
        jojosond.add("You arrive in cosmopolitan Tokyo in the middle of the night. The neon lights surround you as you take a look around the alley. All of a sudden, someone " + "\n" +
                "grapples you and tosses you to the ground. 'Who sent you?' the voice yells at you. You have no idea what's going on and just try to get out of their " + "\n" +
                "hold. Much to your dismay you cannot escape. Luckily a car passes and lights up your face long enough for the black leather suit wearing assailant to realize you aren't a threat. " + "\n" +
                "The red headed beauty releases you quickly and takes a step back. She apologizes as you dust yourself off. 'さようなら' she whispers as she leaps upwards" + "\n" +
                "and disappears in the Tokyo skyline.");
        this.jojoson = new Character("Scarlet Jojoson", 0, jojosond, R.drawable.jojosonimage, 0);

        List<String> aloned= new ArrayList<>();
        aloned.add("Phew, glad this is the case. Who even needs people? " +
                "Am I right?");
        this.alone = new Character("No one", 100, aloned, R.drawable.aloneimage, 0);
    }
    public Character getZeus(){
        return zeus;
    }
}