package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.snackbar.Snackbar;

import edu.vassar.cmpu203.datingsim.databinding.ActivityMainBinding;

public class ActivityMainView implements IActivityMainView{

    FragmentManager fmanager;
    ActivityMainBinding binding;

    Listener listener;

    /**
     * Constructor method.
     * @param activity The android activity the screen is associated with.
     */
    public ActivityMainView(Listener listener, FragmentActivity activity){
        this.fmanager = activity.getSupportFragmentManager();
        this.binding = ActivityMainBinding.inflate(activity.getLayoutInflater());
        this.listener = listener;
        this.binding.settingsButton.setOnClickListener(v -> listener.onSettingsClick());
        this.binding.restartButton.setOnClickListener(v ->  listener.onRestartClick());
        this.binding.glossaryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String glossaryMessage = "- Date: an interaction between two people interested in each other.  \n" +
                        "- Dating Simulator: virtual experience that exposes a player to an unconventional style of dating. \n" +
                        "- Zeus: a god of lightning and thunder. He gets around alot (in stories) \n" +
                        "- Shruck: a big green ogre with small ears (super similar to another green ogre *wink) \n" +
                        "- Bonny: an animatronic who might get a little dangerous (think of five nights at freddys) \n" +
                        "- Satan: a really ravishing devil lady (some may say she's hot as hell) \n" +
                        "- Scarlet Jojoson: a fiery red-headed vigilante (not to be confused with the avenger)";
                Snackbar glossSnack = Snackbar.make(v, glossaryMessage, Snackbar.LENGTH_LONG);
                glossSnack.setTextMaxLines(10);
                glossSnack.show();
            }
        });
    }

    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */
    @Override
    public View getRootView() {
        return this.binding.getRoot();
    }

    /**
     * Replaces the contents of the screen's fragment container with the one passed in as an argument.
     *
     * @param fragment The fragment to be displayed.
     * @param addToStack true if this transaction should be reversible, false otherwise
     * @param name the name this transaction can be referred by.
     */
    @Override
    public void displayFragment(Fragment fragment, boolean addToStack, String name) {
        FragmentTransaction ft = fmanager.beginTransaction();
        ft.replace(this.binding.fragmentContainerView.getId(), fragment);
        if (addToStack)  ft.addToBackStack(name);
        ft.commit();
    }

    public void hideMenu() {
        this.binding.soundButton.setVisibility(View.INVISIBLE);
        this.binding.musicButton.setVisibility(View.INVISIBLE);
        this.binding.glossaryButton.setVisibility(View.INVISIBLE);
        this.binding.restartButton.setVisibility(View.INVISIBLE);
    }

    public void showMenu() {
        this.binding.soundButton.setVisibility(View.VISIBLE);
        this.binding.musicButton.setVisibility(View.VISIBLE);
        this.binding.glossaryButton.setVisibility(View.VISIBLE);
        this.binding.restartButton.setVisibility(View.VISIBLE);
    }

}
