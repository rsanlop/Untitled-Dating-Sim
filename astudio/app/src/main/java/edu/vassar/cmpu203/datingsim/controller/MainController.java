package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.vassar.cmpu203.datingsim.model.Characters;
import edu.vassar.cmpu203.datingsim.model.KissingGame;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.model.Minigame;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.RiddleGame;
import edu.vassar.cmpu203.datingsim.model.TriviaGame;
import edu.vassar.cmpu203.datingsim.view.ActivityMainView;
import edu.vassar.cmpu203.datingsim.view.DateFragment;
import edu.vassar.cmpu203.datingsim.view.EndingFragment;
import edu.vassar.cmpu203.datingsim.view.IActivityMainView;
import edu.vassar.cmpu203.datingsim.view.ICharacterView;
import edu.vassar.cmpu203.datingsim.view.IDateView;
import edu.vassar.cmpu203.datingsim.view.IEndingView;
import edu.vassar.cmpu203.datingsim.view.IInstructionsView;
import edu.vassar.cmpu203.datingsim.view.IKissingGameView;
import edu.vassar.cmpu203.datingsim.view.IMapView;
import edu.vassar.cmpu203.datingsim.view.INameView;
import edu.vassar.cmpu203.datingsim.view.IRiddleGameView;
import edu.vassar.cmpu203.datingsim.view.ISelectionView;
import edu.vassar.cmpu203.datingsim.view.ITitleView;
import edu.vassar.cmpu203.datingsim.view.ITriviaGameView;
import edu.vassar.cmpu203.datingsim.view.InstructionsFragment;
import edu.vassar.cmpu203.datingsim.view.KissingGameFragment;
import edu.vassar.cmpu203.datingsim.view.MapFragment;
import edu.vassar.cmpu203.datingsim.view.NameFragment;
import edu.vassar.cmpu203.datingsim.view.SelectionFragment;
import edu.vassar.cmpu203.datingsim.view.TitleFragment;
import edu.vassar.cmpu203.datingsim.view.TriviaGameFragment;
import edu.vassar.cmpu203.datingsim.view.RiddleGameFragment;
import edu.vassar.cmpu203.datingsim.view.CharacterFragment;


public class MainController extends AppCompatActivity implements IActivityMainView.Listener,  ITitleView.Listener, INameView.Listener, IMapView.Listener, IRiddleGameView.Listener, IKissingGameView.Listener, ITriviaGameView.Listener, IDateView.Listener, ISelectionView.Listener,
        ICharacterView.Listener, IEndingView.Listener, IInstructionsView.Listener {
    Player curPlayer = new Player("");
    Minigame minigame = new Minigame();
    ActivityMainView activityMainView;
    boolean menuHidden;
    Characters characters = new Characters();
    Character prevCharacter;
    String mg;
    KissingGame kissingGame = new KissingGame();
    RiddleGame riddleGame = new RiddleGame();
    TriviaGame triviaGame = new TriviaGame();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set screen contents
        this.activityMainView = new ActivityMainView(this, this );
        setContentView(activityMainView.getRootView());
        this.activityMainView.hideMenu();
        this.activityMainView.displayFragment(new TitleFragment(this), true, "title");
        this.menuHidden = true;

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
    public void onRestartClick() {
        this.activityMainView.displayFragment(new TitleFragment(this), false, "title fragment");}


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
        prevCharacter = characters.shruck;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.shruck), true, "map fragment");

    }
    @Override
    public void onClickedOlympus() {
        prevCharacter = characters.getZeus();
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.getZeus()), true, "map fragment");

    }
    @Override
    public void onClickedFreds() {
        prevCharacter = characters.bonny;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.bonny), true, "map fragment");

    }
    @Override
    public void onClickedHell() {
        prevCharacter = characters.satan;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.satan), true, "map fragment");

    }
    @Override
    public void onClickedJapan() {
        prevCharacter = characters.jojoson;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.jojoson), true, "map fragment");

    }
    @Override
    public void onClickedCharacterScreen() {
        String mg = this.minigame.getMinigame();
        if (mg.equals("Kissing Game")){
            this.activityMainView.displayFragment(new InstructionsFragment(this, kissingGame), true, "kissing game fragment");}

        else if (mg.equals("Trivia Game")){
            this.activityMainView.displayFragment(new InstructionsFragment(this, triviaGame), true, "trivia game fragment");}
        else {
            this.activityMainView.displayFragment(new InstructionsFragment(this, riddleGame), true, "riddle game fragment");}

    }
    @Override
    public void onClickedScreen() {

        curPlayer.incNumDates();
        prevCharacter.incNumDates();
        if (mg.equals("Kissing Game")){
            this.activityMainView.displayFragment(new KissingGameFragment(this), true, "kissing game fragment");}

        else if (mg.equals("Trivia Game")){
            this.activityMainView.displayFragment(new TriviaGameFragment(this), true, "trivia game fragment");}
        else {
            this.activityMainView.displayFragment(new RiddleGameFragment(this), true, "riddle game fragment");}
    }
    @Override
    public void onClickedNext() {
        this.activityMainView.displayFragment(new DateFragment(this), true, "date fragment");
        this.prevCharacter.incAffection();
    }
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

    // --------------------------------------------------------------------------------------------------------

    @Override
    public void onFinalClickedShruck() {
        this.activityMainView.displayFragment(new EndingFragment(this, characters.shruck), true, "shruck fragment");}
    @Override
    public void onFinalClickedZeus() {
        this.activityMainView.displayFragment(new EndingFragment(this, characters.zeus), true, "zeus fragment");}
    @Override
    public void onFinalClickedBonny() {
        this.activityMainView.displayFragment(new EndingFragment(this, characters.bonny), true, "bonny fragment");}
    @Override
    public void onFinalClickedSatan() {
        this.activityMainView.displayFragment(new EndingFragment(this, characters.satan), true, "satan fragment");}
    @Override
    public void onFinalClickedJojoson() {
        this.activityMainView.displayFragment(new EndingFragment(this, characters.jojoson), true, "jojoson fragment");}
    @Override
    public void onClickedAlone() {
        this.activityMainView.displayFragment(new EndingFragment(this, characters.alone), true, "alone fragment");}
    @Override
                    public void onClickedDone() {
        this.activityMainView.displayFragment(new TitleFragment(this), true, "title fragment");}


}




