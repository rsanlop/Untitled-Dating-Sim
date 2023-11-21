package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.model.CharacterMap;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.model.Minigame;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.view.ActivityMainView;
import edu.vassar.cmpu203.datingsim.view.DateFragment;
import edu.vassar.cmpu203.datingsim.view.EndingFragment;
import edu.vassar.cmpu203.datingsim.view.IActivityMainView;
import edu.vassar.cmpu203.datingsim.view.ICharacterView;
import edu.vassar.cmpu203.datingsim.view.IDateView;
import edu.vassar.cmpu203.datingsim.view.IEndingView;
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
        ICharacterView.Listener, IEndingView.Listener {
    Player curPlayer = new Player("");
    Minigame minigame = new Minigame();
    ActivityMainView activityMainView;
    boolean menuHidden;
    CharacterMap listoCharacters;
    Character prevCharacter;
;


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
        this.activityMainView.displayFragment(new CharacterFragment(this, listoCharacters.shruck), true, "map fragment");
        prevCharacter = listoCharacters.shruck;
    }
    @Override
    public void onClickedOlympus() {
        this.activityMainView.displayFragment(new CharacterFragment(this, listoCharacters.zeus), true, "map fragment");
    prevCharacter = listoCharacters.zeus;
    }
    @Override
    public void onClickedFreds() {
        this.activityMainView.displayFragment(new CharacterFragment(this, listoCharacters.bonny), true, "map fragment");
        prevCharacter = listoCharacters.bonny;
    }
    @Override
    public void onClickedHell() {
        this.activityMainView.displayFragment(new CharacterFragment(this, listoCharacters.satan), true, "map fragment");
        prevCharacter = listoCharacters.satan;
    }
    @Override
    public void onClickedJapan() {
        this.activityMainView.displayFragment(new CharacterFragment(this, listoCharacters.jojoson), true, "map fragment");
        prevCharacter = listoCharacters.jojoson;
    }

    @Override
    public void onClickedScreen() {
        String mg = this.minigame.getMinigame();
        curPlayer.incNumDates();
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
        this.activityMainView.displayFragment(new EndingFragment(this, listoCharacters.shruck), true, "shruck fragment");}
    @Override
    public void onFinalClickedZeus() {
        this.activityMainView.displayFragment(new EndingFragment(this, listoCharacters.zeus), true, "zeus fragment");}
    @Override
    public void onFinalClickedBonny() {
        this.activityMainView.displayFragment(new EndingFragment(this, listoCharacters.bonny), true, "bonny fragment");}
    @Override
    public void onFinalClickedSatan() {
        this.activityMainView.displayFragment(new EndingFragment(this, listoCharacters.satan), true, "satan fragment");}
    @Override
    public void onFinalClickedJojoson() {
        this.activityMainView.displayFragment(new EndingFragment(this, listoCharacters.jojoson), true, "jojoson fragment");}
    @Override
    public void onClickedAlone() {
        this.activityMainView.displayFragment(new EndingFragment(this, listoCharacters.alone), true, "alone fragment");}
    @Override
                    public void onClickedDone() {
        this.activityMainView.displayFragment(new TitleFragment(this), true, "title fragment");}

    }




