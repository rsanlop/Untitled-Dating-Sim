package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.view.IAddNameView;
import edu.vassar.cmpu203.datingsim.view.AddNameView;

public class MainActivity extends AppCompatActivity implements IAddNameView.Listener {
    Player curPlayer;
    IAddNameView addNameView; // a reference to the UI object

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

        // create view object
        addNameView = new AddNameView(this, this);

        // set screen contents
        setContentView(addNameView.getRootView());
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

    /* IAddItemsView.Listener implementation end */
}
