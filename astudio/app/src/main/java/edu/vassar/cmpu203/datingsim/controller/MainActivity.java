package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.view.ActivityMainView;
import edu.vassar.cmpu203.datingsim.view.IActivityMainView;
import edu.vassar.cmpu203.datingsim.view.IAddNameView;
//import edu.vassar.cmpu203.datingsim.view.AddNameView;

public class MainActivity extends AppCompatActivity implements IActivityMainView.Listener {
    Player curPlayer;
    IAddNameView addNameView; // a reference to the UI object
    IActivityMainView activityMainView;



    private boolean toggle = false; // dont show other buttons


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
        this.activityMainView = new ActivityMainView(this);
        setContentView(activityMainView.getRootView());
        this.activityMainView.hideMenu();
    }

    /* IAddItemsView.Listener implementation start */

    /**
     * Called when an item is to be added onto the sale.
     *
     * @param name name of product to add
     */
    @Override
    public void onAddedName(String name) {
        this.addNameView.updateNameDisplay(curPlayer); // tell ui to update itself
    }

    public void onSettingsClick(){

        //need to implement listener here

        if (!toggle) { // if true
            activityShortcut.this.binding.soundButton.setVisibility(View.VISIBLE);
            ActivityMainView.this.binding.musicButton.setVisibility(View.VISIBLE);
            ActivityMainView.this.binding.glossaryButton.setVisibility(View.VISIBLE);
            ActivityMainView.this.binding.restartButton.setVisibility(View.VISIBLE);
            toggle = true;
        }
        else{
            ActivityMainView.this.binding.soundButton.setVisibility(View.INVISIBLE);
            ActivityMainView.this.binding.musicButton.setVisibility(View.INVISIBLE);
            ActivityMainView.this.binding.glossaryButton.setVisibility(View.INVISIBLE);
            ActivityMainView.this.binding.restartButton.setVisibility(View.INVISIBLE);
            toggle = false;
        }
    }

    /* IAddItemsView.Listener implementation end */
}
