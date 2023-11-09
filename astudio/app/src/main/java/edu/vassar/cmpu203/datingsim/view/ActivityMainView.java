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

import edu.vassar.cmpu203.datingsim.databinding.ActivityMainBinding;

public class ActivityMainView implements IActivityMainView{

    FragmentManager fmanager;
    ActivityMainBinding binding;

    Listener listener;

    private boolean toggle;

    /**
     * Constructor method.
     * @param activity The android activity the screen is associated with.
     */
    public ActivityMainView(Listener listener, FragmentActivity activity){
        this.fmanager = activity.getSupportFragmentManager();
        this.binding = ActivityMainBinding.inflate(activity.getLayoutInflater());
        this.listener = listener;
        this.binding.settingsButton.setOnClickListener(v -> listener.onSettingsClick());
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
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        return this.binding.getRoot();
//    }


    //@Override
//    public void onCreate(Bundle savedInstanceState){
//    Log.d("View Created", "true");
//        this.binding.settingsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               listener.onSettingsClick();
//            }
//        });
//    }

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
