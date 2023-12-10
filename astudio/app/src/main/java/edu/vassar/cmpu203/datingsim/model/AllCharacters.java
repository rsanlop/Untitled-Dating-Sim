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
        zeusd.add("\"Well, well, well! What do we have here?\" Zeus booms with laughter as he notices your presence. He flexes \n" +
                "his mighty arms, causing sparks of divine energy to illuminate the air. \"Ah, mortal, you've caught me in the \n" +
                "middle of my celestial workout routine. Quite the sight, isn't it?\" Zeus grins mischievously, flexing his \n" +
                "celestial muscles. Thunder rumbles in the background, emphasizing the godly display.\"I must say, you've got a good \n" +
                "eye for timing. Not everyone gets to witness the king of the gods in his divine workout attire,\" Zeus remarks, a \n" +
                "twinkle of amusement in his sky-blue eyes.");
        zeusd.add("With a twinkle in his sky-blue eyes, Zeus greets you with a sly smile.\"Well, well, look who's back for another \n" +
                "round,\" he chuckles, leaning casually against his golden throne. The air crackles with a playful energy.\n" +
                "\"You must have missed the divine charm of Olympus,\" Zeus teases, his voice carrying a hint of mischief.");
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
        shruckd.add("\"Hmm, what's this then? Another intruder in my beloved swamp?\" The voice, laced with a hint of posh British sarcasm, rings out.\n" +
                "\"Well, aren't you a brave little adventurer?\" They scoff, shooting you a sidelong glance. \"Don't go thinking this swamp welcomes just \n" +
                "anyone. It's my domain, and I don't need any meddling outsiders. Despite the rudeness, there's a peculiar charm to their British accent \n" +
                "and the way they scowl with a mix of annoyance and intrigue.");
        shruckd.add("As you entered the room, you immediately spotted the surly British ogre you had crossed paths with before. He scowled at you from \n" +
                "across the room, a pint in hand, looking as ornery as ever. \"Oi, what's this, then? If it ain't the cheeky so-and-so,\" he grumbled, \n" +
                "taking a swig of his drink. You couldn't resist a smirk. He shot you a glare that could curdle milk. \" What're you after now, eh?\"\n" +
                "You leaned in, undeterred by his abrasive demeanor. \"Just thought I'd grace you with my charming presence. You know, spread a bit of \n" +
                "sunshine your way.\" He just grunted in response, but you couldn't help but detect a hint of a smirk. It seemed like, beneath the \n" +
                "rugged exterior, there might be a begrudging tolerance for your antics after all.");
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
        bonnyd.add("In the dimly lit entertainment venue, you find Bonny, the purple animatronic, once again. Standing silently with \n" +
                "expressive eyes, she acknowledges your presence. You greet her, and in return, she subtly nods—a familiar exchange \n" +
                "between old friends. Despite her limited speech, Bonny communicates volumes through deliberate gestures and a quiet \n" +
                "charm. In these moments of shared warmth, you feel understood and appreciated in the whimsical world of neon and \n" +
                "nostalgia" );
        bonnyd.add("The air is charged with a quiet energy as Bonny extends her robotic hand, a gesture that feels both intentional and\n" +
                " tender. Intrigued, you reach out, and your fingers delicately intertwine with hers. The touch, though mechanical, \n" +
                "carries a sense of connection that transcends the boundaries of artificiality.");
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
        satand.add("Satan leans in, her voice a sultry whisper, \"You must be addicted to the sizzling company and the eternal warmth. I don't blame you; I've got a \n" +
                "hell of a charm, haven't I? Now, what's the sin that brings you back to my fiery embrace?\"");
        satand.add("She raises an eyebrow, her lips curling into a mischievous smile. \"Oh, you're positively devilish in your return. Perhaps you're just here to \n" +
                "indulge in the forbidden fruits, or maybe you're hoping for a taste of something even sweeter?\"");
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