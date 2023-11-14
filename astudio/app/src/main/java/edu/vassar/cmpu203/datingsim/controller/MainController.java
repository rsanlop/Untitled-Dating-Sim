package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.model.Minigame;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.Endings;
import edu.vassar.cmpu203.datingsim.model.Game;
import edu.vassar.cmpu203.datingsim.view.ActivityMainView;
import edu.vassar.cmpu203.datingsim.view.AloneFragment;
import edu.vassar.cmpu203.datingsim.view.BonnyFragment;
import edu.vassar.cmpu203.datingsim.view.DateFragment;
import edu.vassar.cmpu203.datingsim.view.IActivityMainView;
import edu.vassar.cmpu203.datingsim.view.IAddNameView;
import edu.vassar.cmpu203.datingsim.view.IBonnyView;
import edu.vassar.cmpu203.datingsim.view.ICharacterView;
import edu.vassar.cmpu203.datingsim.view.IDateView;
import edu.vassar.cmpu203.datingsim.view.IJojosonView;
import edu.vassar.cmpu203.datingsim.view.IKissingGameView;
import edu.vassar.cmpu203.datingsim.view.IMapView;
import edu.vassar.cmpu203.datingsim.view.INameView;
import edu.vassar.cmpu203.datingsim.view.IRiddleGameView;
import edu.vassar.cmpu203.datingsim.view.ISatanView;
import edu.vassar.cmpu203.datingsim.view.ISelectionView;
import edu.vassar.cmpu203.datingsim.view.IShruckView;
import edu.vassar.cmpu203.datingsim.view.ITitleView;
import edu.vassar.cmpu203.datingsim.view.ITriviaGameView;
import edu.vassar.cmpu203.datingsim.view.IZeusView;
import edu.vassar.cmpu203.datingsim.view.JojosonFragment;
import edu.vassar.cmpu203.datingsim.view.KissingGameFragment;
import edu.vassar.cmpu203.datingsim.view.MapFragment;
import edu.vassar.cmpu203.datingsim.view.NameFragment;
import edu.vassar.cmpu203.datingsim.view.SatanFragment;
import edu.vassar.cmpu203.datingsim.view.SelectionFragment;
import edu.vassar.cmpu203.datingsim.view.ShruckFragment;
import edu.vassar.cmpu203.datingsim.view.TitleFragment;
import edu.vassar.cmpu203.datingsim.view.TriviaGameFragment;
import edu.vassar.cmpu203.datingsim.view.ZeusFragment;
import edu.vassar.cmpu203.datingsim.view.RiddleGameFragment;
import edu.vassar.cmpu203.datingsim.view.CharacterFragment;


public class MainController extends AppCompatActivity implements IActivityMainView.Listener,  ITitleView.Listener, INameView.Listener, IMapView.Listener, IZeusView.Listener, IShruckView.Listener,
        IJojosonView.Listener, ISatanView.Listener, IBonnyView.Listener, IRiddleGameView.Listener, IKissingGameView.Listener, ITriviaGameView.Listener, IDateView.Listener, ISelectionView.Listener,
        ICharacterView.Listener {
    Player curPlayer = new Player("", 0);
    List<String> zeusd = new ArrayList<>();
    Character zeus = new Character("Zeus", "Olympus", 0, zeusd);
    List<String> shruckd = new ArrayList<>();
    Character shruck = new Character("Shruck", "Swamp", 0, shruckd);
    List<String> bonnyd = new ArrayList<>();
    Character bonny = new Character("Bonny", "Freddy's Pizzeria", 0, bonnyd);
    List<String> satand = new ArrayList<>();
    Character satan = new Character("Satan", "Hell", 0, satand);
    List<String> jojosond = new ArrayList<>();
    Character jojoson = new Character("Scarlet Jojoson", "Japan", 0, jojosond);
    List<String> emptyd= new ArrayList<>();
    Character empty = new Character("", "", 100, emptyd);
    Minigame minigame = new Minigame();
    ActivityMainView activityMainView;

    boolean menuHidden;

    /**
     * This method is called by the Android framework whenever the activity is created or recreated.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     */
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
            menuHidden = false;
        }

    }

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

    @Override
    public void onClickedSwamp() {
        this.activityMainView.displayFragment(new ShruckFragment(this), true, "map fragment");}
    @Override
    public void onClickedOlympus() {
        this.activityMainView.displayFragment(new ZeusFragment(this), true, "map fragment");}
    @Override
    public void onClickedFreds() {
        this.activityMainView.displayFragment(new BonnyFragment(this), true, "map fragment");}
    @Override
    public void onClickedHell() {
        this.activityMainView.displayFragment(new SatanFragment(this), true, "map fragment");}
    @Override
    public void onClickedJapan() {
        this.activityMainView.displayFragment(new JojosonFragment(this), true, "map fragment");}


    @Override
    public void onClickedDate() {
        String mg = this.minigame.getMinigame();
        if ( mg.equals("Kissing Game")){
            this.activityMainView.displayFragment(new KissingGameFragment(this), true, "kissing game fragment");}

        else if (mg.equals("Trivia Game")){
            this.activityMainView.displayFragment(new TriviaGameFragment(this), true, "trivia game fragment");
        }
        else {
            this.activityMainView.displayFragment(new RiddleGameFragment(this), true, "riddle game fragment");
        }
    }

    @Override
    public void onClickedNext() {
        this.activityMainView.displayFragment(new DateFragment(this), true, "date fragment");
    }

    @Override
    public void onClickedYes() {
        this.activityMainView.displayFragment(new MapFragment(this), true, "map fragment");
    }

    @Override
    public void onClickedNo() {
        this.activityMainView.displayFragment(new SelectionFragment(this), true, "map fragment");
    }

    @Override
    public void onClickedShruck() {
        this.activityMainView.displayFragment(new ShruckFragment(this), true, "shruck fragment");}

    @Override
    public void onClickedZeus() {
        this.activityMainView.displayFragment(new ZeusFragment(this), true, "zeus fragment");}


    @Override
    public void onClickedBonny() {
        this.activityMainView.displayFragment(new BonnyFragment(this), true, "bonny fragment");}


    @Override
    public void onClickedSatan() {
        this.activityMainView.displayFragment(new SatanFragment(this), true, "satan fragment");}


    @Override
    public void onClickedJojoson() {
        this.activityMainView.displayFragment(new JojosonFragment(this), true, "jojoson fragment");}

    @Override
    public void onClickedAlone() {
        this.activityMainView.displayFragment(new AloneFragment(), true, "alone fragment");

    }
}



