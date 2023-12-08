package edu.vassar.cmpu203.datingsim.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import java.io.File;

import edu.vassar.cmpu203.datingsim.model.AllCharacters;
import edu.vassar.cmpu203.datingsim.model.KissingGame;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.model.Minigame;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.RiddleGame;
import edu.vassar.cmpu203.datingsim.model.TriviaGame;
import edu.vassar.cmpu203.datingsim.persistence.IPersistenceFacade;
import edu.vassar.cmpu203.datingsim.persistence.LocalStorageFacade;
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
import edu.vassar.cmpu203.datingsim.view.IStatsView;
import edu.vassar.cmpu203.datingsim.view.ITitleView;
import edu.vassar.cmpu203.datingsim.view.ITriviaGameView;
import edu.vassar.cmpu203.datingsim.view.InstructionsFragment;
import edu.vassar.cmpu203.datingsim.view.KissingGameFragment;
import edu.vassar.cmpu203.datingsim.view.MapFragment;
import edu.vassar.cmpu203.datingsim.view.NameFragment;
import edu.vassar.cmpu203.datingsim.view.SelectionFragment;
import edu.vassar.cmpu203.datingsim.view.StatsFragment;
import edu.vassar.cmpu203.datingsim.view.TitleFragment;
import edu.vassar.cmpu203.datingsim.view.TriviaGameFragment;
import edu.vassar.cmpu203.datingsim.view.RiddleGameFragment;
import edu.vassar.cmpu203.datingsim.view.CharacterFragment;


public class MainController extends AppCompatActivity implements IActivityMainView.Listener,  ITitleView.Listener, INameView.Listener, IMapView.Listener, IRiddleGameView.Listener, IKissingGameView.Listener, ITriviaGameView.Listener, IDateView.Listener, ISelectionView.Listener,
        ICharacterView.Listener, IEndingView.Listener, IInstructionsView.Listener, IStatsView.Listener {
    Player curPlayer;
    Minigame minigame = new Minigame();
    ActivityMainView activityMainView;
    boolean menuHidden;
    AllCharacters characters;
    Character curCharacter;
    String mg;
    KissingGame kissingGame = new KissingGame();
    RiddleGame riddleGame = new RiddleGame();
    TriviaGame triviaGame = new TriviaGame();

    IPersistenceFacade persFacade;

    File storage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set screen contents
        this.activityMainView = new ActivityMainView(this, this );
        setContentView(activityMainView.getRootView());
        this.activityMainView.hideMenu();
        this.activityMainView.displayFragment(new TitleFragment(this), true, "title");
        this.menuHidden = true;
        this.storage = getFilesDir();
        this.characters = new AllCharacters();
        this.persFacade = new LocalStorageFacade(storage);
        this.curPlayer = new Player("");
        this.persFacade.retrieveCharacters(new IPersistenceFacade.Listener() {
            @Override
            public void onCharactersReceived(@NonNull AllCharacters characters) {
                MainController.this.characters = characters;
            }
            @Override
            public void onPlayerReceived(@NonNull Player player) {

            }


        });
        this.persFacade.retrievePlayer(new IPersistenceFacade.Listener() {
            @Override
            public void onCharactersReceived(@NonNull AllCharacters characters) {

            }

            @Override
            public void onPlayerReceived(@NonNull Player curPlayer) {
                MainController.this.curPlayer = curPlayer;
            }
        });

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
        this.characters = new AllCharacters();
        this.curPlayer = new Player("");
        this.activityMainView.displayFragment(new TitleFragment(this), false, "title fragment");}

    @Override
    public void onNewGameClicked() {
        this.characters = new AllCharacters();
        this.curPlayer = new Player("");
        this.activityMainView.displayFragment(new NameFragment(this), false, "name fragment");}

    @Override
    public void onContinueClicked() {
        this.activityMainView.displayFragment(new MapFragment(this), false, "map fragment");}

    @Override
    public void onAddedName(String name, INameView view) {
        this.curPlayer.setName(name);
        this.persFacade.savePlayer(curPlayer);
        this.activityMainView.displayFragment(new MapFragment(this), true, "map fragment");}

    // ----------------------------------------------------------------------------------------------------------------
    @Override
    public void onClickedSwamp() {
        curCharacter = characters.shruck;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.shruck), true, "map fragment");

    }
    @Override
    public void onClickedOlympus() {
        curCharacter = characters.zeus;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.zeus), true, "map fragment");

    }
    @Override
    public void onClickedFreds() {
        curCharacter = characters.bonny;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.bonny), true, "map fragment");

    }
    @Override
    public void onClickedHell() {
        curCharacter = characters.satan;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.satan), true, "map fragment");

    }
    @Override
    public void onClickedJapan() {
        curCharacter = characters.jojoson;
        this.activityMainView.displayFragment(new CharacterFragment(this, characters.jojoson), true, "map fragment");

    }
    @Override
    public void onClickedCharacterScreen() {
        mg = this.minigame.getMinigame();
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
        this.persFacade.savePlayer(curPlayer);
        curCharacter.incNumDates();
        this.persFacade.saveCharacters(characters);
        if (mg.equals("Kissing Game")){
            this.activityMainView.displayFragment(new KissingGameFragment(this, curCharacter), true, "kissing game fragment");}

        else if (mg.equals("Trivia Game")){
            this.activityMainView.displayFragment(new TriviaGameFragment(this, triviaGame), true, "trivia game fragment");}
        else {
            this.activityMainView.displayFragment(new RiddleGameFragment(this, riddleGame), true, "riddle game fragment");}
    }
    @Override
    public void onClickedNext() {
        this.persFacade.saveCharacters(characters);
        this.activityMainView.displayFragment(new DateFragment(this), true, "date fragment");
    }

    @Override
    public void onGameDone(boolean result) {
        this.persFacade.saveCharacters(characters);
        if (mg.equals("Kissing Game")){
            this.activityMainView.displayFragment(new StatsFragment(this, curCharacter, result, kissingGame), true, "stats fragment");
        }
        else if (mg.equals("Trivia Game")){
            this.activityMainView.displayFragment(new StatsFragment(this, curCharacter, result, triviaGame), true, "trivia game fragment");}
        else {
            this.activityMainView.displayFragment(new StatsFragment(this, curCharacter, result, riddleGame), true, "riddle game fragment");}


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
        this.characters = new AllCharacters();
        this.curPlayer = new Player("");
        this.activityMainView.displayFragment(new TitleFragment(this), true, "title fragment");}


}




