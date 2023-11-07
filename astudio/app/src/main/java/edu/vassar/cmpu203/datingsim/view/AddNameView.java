/*
package edu.vassar.cmpu203.datingsim.view;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.button.MaterialButton;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.model.Player;
import edu.vassar.cmpu203.datingsim.databinding.ActivityMainBinding;

*/
/**
 * Implements IAddItemsView interface.
 *//*

public class AddNameView implements IAddNameView{

    ActivityMainBinding binding; // gives us access to the graphical elements defined in res/layout/activity_main.xml
    Listener listener; // object to be notified of events of interest that happen in the UI

    */
/**
     * Initializes the add items view.
     *
     * @param context the context under which the UI will run
     * @param listener the object to be notified when an event of interest occurs
     *//*

    public AddNameView(Context context, Listener listener){

        this.listener = listener;

        // inflate the layout
        this.binding = ActivityMainBinding.inflate(LayoutInflater.from(context));

        // register add button click listener
        this.binding.button.setOnClickListener(new View.OnClickListener() {

            */
/**
             * Called when associated button is clicked.
             * @param v The view that was clicked.
             *//*

            @Override
            public void onClick(View v) {

                // retrieves name
                final Editable nameEditable = (Editable) AddNameView.this.binding.nameView.getText();
                final String nameStr = nameEditable.toString();

                // notify listener (controller)
                AddNameView.this.listener.onAddedName(nameStr);
            }
        });
    }

    */
/**
     * Rrturns the screen's top-level view.
     * @return The screen's top-level view.
     *//*

    @Override
    public View getRootView() {
        return this.binding.getRoot();
    }

    */
/**
     * Update display to reflect contents of the sale passed as an argument.
     * @param sale the sale to be displayed
     *//*

    @Override
    public void updateNameDisplay(Player player) {
        this.binding.nameView.setText(player.toString());
    }

}

*/
