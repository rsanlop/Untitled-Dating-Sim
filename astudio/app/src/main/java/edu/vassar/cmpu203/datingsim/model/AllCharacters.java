package edu.vassar.cmpu203.datingsim.model;

import java.util.ArrayList;
import java.util.List;

import edu.vassar.cmpu203.datingsim.R;

/**
 * Map class which contains character's locations
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class AllCharacters implements java.io.Serializable {

    public Character zeus;

    public Character shruck;

    public Character bonny;

    public Character satan;

    public Character jojoson;

    public Character alone;


    public AllCharacters() {

        List<String> zeusd = new ArrayList<>();
        zeusd.add("You see a swan. Not just any swan though. It's Zeus! He notices you walk up to the gates and greets you" + "\n" +
                "'Why hello there. You look... rather ravishing.' He whistles as he looks you up and down. (He likes" + "\n" +
                "what he sees.) 'Oh, please excuse my disheveled form!' He waddles in a circle at lightning speed" + "\n" +
                "and poof. He's actually kind of ripped. (as a human) 'I hope you like what YOU see.' He gives a smug" + "\n" +
                "look");
        zeusd.add("Oh, welcome back %s.");
        zeusd.add("You just looove coming back~~ ;)");
        zeusd.add("I knew you always wanted me. I cant believe you tried to resist all of ~this~. What a silly goose, come here. ;)");
        zeusd.add("Zeus takes a quick glance at you, turns his head swiftly and flies off in his swan form while honking 'As if!'");

        this.zeus = new Character("Zeus", 0, zeusd, R.drawable.zeus, 0,
                R.drawable.heraandzeusnotkiss, R.drawable.zeuskiss, R.drawable.persleft,
                R.drawable.perswarn, R.drawable.perseright, R.drawable.hades,R.drawable.zeus, R.drawable.zeus );

        List<String> shruckd = new ArrayList<>();
        shruckd.add("You see a farty swamp the size of small house, right in front of a run-down tree house. You see the door slam open" + "\n" +
                "and out walks a bumbling green figure. 'YOU!' he says as he points his stubby finger in your direction. He proceeds " + "\n" +
                "to stomp towards you. 'WHAT ARE YOU DOING IN MY BLOODY SWAMP!' he bellows, as pieces of his stinky dinner fly out his" + "\n" +
                "mouth and onto your face. 'DON'T TELL ME YOU WANT TO FART IN IT. BECAUSE LET ME TELL YOU. THE ONLY ONE WHO CAN FART IN" + "\n" +
                "MY BLOODY SWAMP IS MY BLOODY ARSE!'");
        shruckd.add("ARGG, ARGG you glad you came?");
        shruckd.add("Roses are red, violets are blue, I just farted, phew.");
        shruckd.add("Shruck poofs and before you is not the original shruck that you've seen so often.");
        shruckd.add("Shruck takes one good look at you, pauses to silently open his mouth, and all of a sudden you see chunks of his breakfast, lunch, and dinner all" +
                "spill out over you.");
        this.shruck = new Character("Shruck", 0, shruckd, R.drawable.shruck, 0,
                R.drawable.shreknotkiss, R.drawable.shrekkiss, R.drawable.donkeyleft, R.drawable.donkeywarning,
                R.drawable.donkeyright, R.drawable.dragon, R.drawable.shruck_goodending, R.drawable.shruck);


        List<String> bonnyd = new ArrayList<>();
        bonnyd.add("You appear at an abandoned Pizzeria, that eerily feels familiar. As you pass through the rickety doors you sense" + "\n" +
                "that you are not alone. There's a stage, with one purple character, that seems to be where the old mascots would perform. " + "\n" +
                "It's eyes light up as it stares at you. You approach it without knowing why. Then it starts to walk towards you. " + "\n" +
                "As it holds out it's hands it says 'Pizza?' in a slow robotic voice. You look at the hands and there is no pizza :(. " + "\n" +
                "Afraid of what will happen if you refuse, you take the fake pizza and pretend to eat it. After seeing you play along " + "\n" +
                "the purple animatronic looks and you and slowly says 'Bonny'.");
        bonnyd.add("har har har har" );
        bonnyd.add("DUYGI^GD*@(@EHxUHJNJOI CANNOLI??? *Y(HYD#(8");
        bonnyd.add("Bonny jumps up and down in all her rusty and clangy glory. HAA AH AK is all she can make out due to pure excitement");
        bonnyd.add("Bonny emerges from the darkness ever so slowly, takes one long look at you, then slwoly backs away in dissapointment. HARR HAR   HAR....");
        this.bonny = new Character("Bonny", 0, bonnyd, R.drawable.bonny, 0,
                R.drawable.bonnynotkiss, R.drawable.bonnykiss, R.drawable.boyleft, R.drawable.boywarning,
                R.drawable.boyright, R.drawable.collapsedfreddy, R.drawable.bonny, R.drawable.bonny);

        List<String> satand = new ArrayList<>();
        satand.add("Immediately you feel the immense heat radiating all around you. There's no doubt you are in Hell. Satan stands before you in all her " + "\n" +
                "sultry glory. She seductively catwalks over to you. 'Greetings, or should I say Hell-o.' She bats her eyes and tucks her hair behind her " + "\n" +
                "ear proudly. She then says 'Pretty hot in here, right?' as she hold up a finger heart with flames coming out of it and then she can't help but " + "\n" +
                "wink at you. 'Or maybe its just you' she says while pointing at you. You can only help but think Hell yea.");
        satand.add("hell of a surprise to see you again :)");
        satand.add("try not to get hot and bothered :)))");
        satand.add("Why of course you'd choose me. Temptation? I invented her ;)");
        satand.add("Satan looks at you in total disgust. She lifts a finger to your face and all of a sudden you are engulfed in flames so hot your body immediately melts away." +
                "Tsk tsk tsk good riddance.");
        this.satan = new Character("Satan", 0, satand, R.drawable.satan, 0,
                R.drawable.yunonotkiss, R.drawable.yunokiss, R.drawable.akiseleft, R.drawable.akisewarning,
                R.drawable.akiseright, R.drawable.murumuru, R.drawable.satan, R.drawable.satan);


        List<String> jojosond = new ArrayList<>();
        jojosond.add("You arrive in cosmopolitan Tokyo in the middle of the night. The neon lights surround you as you take a look around the alley. All of a sudden, someone " + "\n" +
                "grapples you and tosses you to the ground. 'Who sent you?' the voice yells at you. You have no idea what's going on and just try to get out of their " + "\n" +
                "hold. Much to your dismay you cannot escape. Luckily a car passes and lights up your face long enough for the black leather suit wearing assailant to realize you aren't a threat. " + "\n" +
                "The red headed beauty releases you quickly and takes a step back. She apologizes as you dust yourself off. 'さようなら' she whispers as she leaps upwards" + "\n" +
                "and disappears in the Tokyo skyline.");
        jojosond.add("What are you doing back here? ");
        jojosond.add("*kicks you*");
        jojosond.add("Our love, as taboo as it is, is inevitable. You have my a hold of my ice cold heart.");
        jojosond.add("Scarlet Jojoson swiftly moves in your direction. You don't notice until she backs away and leaps back into the Tokyo Skyline, that she just stabbed you with " +
                "her dagger. You fall back onto the alley in which the two of you first met. You close your eyes forever.");
        this.jojoson = new Character("Scarlet Jojoson", 0, jojosond, R.drawable.jojoson, 0,
                R.drawable.jojosonnotkiss, R.drawable.jojosonkiss, R.drawable.polarexpressgirlleft, R.drawable.polarexpressgirlwarning,
                R.drawable.polarexpressgirlright, R.drawable.holk,R.drawable.jojoson, R.drawable.jojoson );

        List<String> aloned = new ArrayList<>();
        aloned.add("Phew, glad this is the case. Who even needs people? " +
                "Am I right?");
        aloned.add("WOOHOO YOU'RE FREE! FREE AS A BIRD WHO HAS JUST BEEN RELEASED FROM A LIFETIME OF BEING CAGED! SINGLE IS THE WAY TO GO");
        aloned.add("Self love... that's where it's at. Good job! :D");
        aloned.add("You inhale deeply. The dates were nice but ultimately " +
                "you aren't ready to settle down and choose anyone right now. You walk down " +
                "the beach and smile while remembering the people you've met. ");
        aloned.add("");
        this.alone = new Character("No one", 100, aloned, R.drawable.aloneimage, 0,
                0, 0, 0, 0, 0, 0,
                R.drawable.aloneimage, R.drawable.aloneimage );
    }
}