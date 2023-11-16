package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.model.Minigame;
import edu.vassar.cmpu203.datingsim.model.Character;
/*import edu.vassar.cmpu203.datingsim.model.Game;*/
import edu.vassar.cmpu203.datingsim.view.ActivityMainView;
import edu.vassar.cmpu203.datingsim.view.AloneFragment;
import edu.vassar.cmpu203.datingsim.view.DateFragment;
import edu.vassar.cmpu203.datingsim.view.IActivityMainView;
import edu.vassar.cmpu203.datingsim.view.ICharacterView;
import edu.vassar.cmpu203.datingsim.view.IDateView;
import edu.vassar.cmpu203.datingsim.view.IKissingGameView;
import edu.vassar.cmpu203.datingsim.view.IMapView;
import edu.vassar.cmpu203.datingsim.view.INameView;
import edu.vassar.cmpu203.datingsim.view.IRiddleGameView;
import edu.vassar.cmpu203.datingsim.view.ISelectionView;
import edu.vassar.cmpu203.datingsim.view.ITitleView;
import edu.vassar.cmpu203.datingsim.view.ITriviaGameView;
import edu.vassar.cmpu203.datingsim.view.KissingGameFragment;
import edu.vassar.cmpu203.datingsim.view.MapFragment;
import edu.vassar.cmpu203.datingsim.view.NameFragment;
import edu.vassar.cmpu203.datingsim.view.SelectionFragment;
import edu.vassar.cmpu203.datingsim.view.TitleFragment;
import edu.vassar.cmpu203.datingsim.view.TriviaGameFragment;
import edu.vassar.cmpu203.datingsim.view.RiddleGameFragment;
import edu.vassar.cmpu203.datingsim.view.CharacterFragment;


public class MainController extends AppCompatActivity implements IActivityMainView.Listener,  ITitleView.Listener, INameView.Listener, IMapView.Listener, IRiddleGameView.Listener, IKissingGameView.Listener, ITriviaGameView.Listener, IDateView.Listener, ISelectionView.Listener,
        ICharacterView.Listener {
    Player curPlayer = new Player("");
    List<String> zeusd = new ArrayList<>();
    Character zeus = new Character("Zeus", "Olympus", 0, zeusd, R.drawable.zeusimage);
    List<String> shruckd = new ArrayList<>();
    Character shruck = new Character("Shruck", "Swamp", 0, shruckd, R.drawable.shruckimage);
    List<String> bonnyd = new ArrayList<>();
    Character bonny = new Character("Bonny", "Freddy's Pizzeria", 0, bonnyd, R.drawable.bonnyimage);
    List<String> satand = new ArrayList<>();
    Character satan = new Character("Satan", "Hell", 0, satand, R.drawable.satanimage);
    List<String> jojosond = new ArrayList<>();
    Character jojoson = new Character("Scarlet Jojoson", "Japan", 0, jojosond, R.drawable.jojosonimage);
    List<String> emptyd= new ArrayList<>();
    Character empty = new Character("", "", 100, emptyd, 100);

    Minigame minigame = new Minigame();
    ActivityMainView activityMainView;
    boolean menuHidden;

    boolean minDates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set screen contents
        this.activityMainView = new ActivityMainView(this, this );
        setContentView(activityMainView.getRootView());
        this.activityMainView.hideMenu();
        this.activityMainView.displayFragment(new TitleFragment(this), true, "title");
        this.menuHidden = true;
        this.minDates = false;

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

    @Override
    public void onSettingsClick() {
        if (!menuHidden) { // if true
            this.activityMainView.hideMenu();
            menuHidden = true;
        }
        else{
            this.activityMainView.showMenu();
            menuHidden = false;}}


    @Override
    public void onNewGameClicked() {
        this.activityMainView.displayFragment(new NameFragment(this), false, "name fragment");}

    @Override
    public void onContinueClicked() {
        this.activityMainView.displayFragment(new MapFragment(this), false, "map fragment");}

    @Override
    public void onAddedName(String name, INameView view) {
        this.curPlayer.setName(name);
        this.activityMainView.displayFragment(new MapFragment(this), true, "map fragment");}

    // ----------------------------------------------------------------------------------------------------------------
    @Override
    public void onClickedSwamp() {
        this.activityMainView.displayFragment(new CharacterFragment(this, shruck), true, "map fragment");}
    @Override
    public void onClickedOlympus() {
        this.activityMainView.displayFragment(new CharacterFragment(this, zeus), true, "map fragment");}
    @Override
    public void onClickedFreds() {
        this.activityMainView.displayFragment(new CharacterFragment(this, bonny), true, "map fragment");}
    @Override
    public void onClickedHell() {
        this.activityMainView.displayFragment(new CharacterFragment(this, satan), true, "map fragment");}
    @Override
    public void onClickedJapan() {
        this.activityMainView.displayFragment(new CharacterFragment(this, jojoson), true, "map fragment");}

    @Override
    public void onClickedScreen() {
        String mg = this.minigame.getMinigame();
        curPlayer.incNumDates();
        if ( mg.equals("Kissing Game")){
            this.activityMainView.displayFragment(new KissingGameFragment(this), true, "kissing game fragment");}

        else if (mg.equals("Trivia Game")){
            this.activityMainView.displayFragment(new TriviaGameFragment(this), true, "trivia game fragment");}
        else {
            this.activityMainView.displayFragment(new RiddleGameFragment(this), true, "riddle game fragment");}
    }
    @Override
    public void onClickedNext() {
        this.activityMainView.displayFragment(new DateFragment(this), true, "date fragment");}

    // ----------------------------------------------------------------------------------------------------------------

    public int numDates(){
        return curPlayer.getNumDates();
    }
    @Override
    public void onClickedYes() {
        this.activityMainView.displayFragment(new MapFragment(this), true, "map fragment");
    }

    @Override
    public void onClickedNo() {
        this.activityMainView.displayFragment(new SelectionFragment(this), true, "map fragment");

    }

    // ----------------------------------------------------------------------------------------------------------------


    @Override
    public void onClickedShruck() {
        this.activityMainView.displayFragment(new CharacterFragment(this, shruck), true, "shruck fragment");}
    @Override
    public void onClickedZeus() {
        this.activityMainView.displayFragment(new CharacterFragment(this, zeus), true, "zeus fragment");}
    @Override
    public void onClickedBonny() {
        this.activityMainView.displayFragment(new CharacterFragment(this, bonny), true, "bonny fragment");}
    @Override
    public void onClickedSatan() {
        this.activityMainView.displayFragment(new CharacterFragment(this, satan), true, "satan fragment");}
    @Override
    public void onClickedJojoson() {
        this.activityMainView.displayFragment(new CharacterFragment(this, jojoson), true, "jojoson fragment");}
    @Override
    public void onClickedAlone() {
        this.activityMainView.displayFragment(new AloneFragment(), true, "alone fragment");}

}



