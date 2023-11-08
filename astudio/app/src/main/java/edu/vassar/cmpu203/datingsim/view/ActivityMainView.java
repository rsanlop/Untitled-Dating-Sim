package edu.vassar.cmpu203.datingsim.view;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.widget.Button;

import edu.vassar.cmpu203.datingsim.databinding.ActivityMainBinding;

public class ActivityMainView implements IActivityMainView{

    FragmentManager fmanager;
    ActivityMainBinding binding;

    Listener listener;



    /**
     * Constructor method.
     * @param activity The android activity the screen is associated with.
     */
    public ActivityMainView(FragmentActivity activity, Listener listener){
        this.fmanager = activity.getSupportFragmentManager();
        this.binding = ActivityMainBinding.inflate(activity.getLayoutInflater());
        this.listener = listener;
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

    public void displayMenuOptions(){

        this.binding.settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityMainView.this.listener.onSettingsClick();


            }
        });
    }

    public void hideMenu() {
        this.binding.soundButton.setVisibility(View.INVISIBLE);
        this.binding.musicButton.setVisibility(View.INVISIBLE);
        this.binding.glossaryButton.setVisibility(View.INVISIBLE);
        this.binding.restartButton.setVisibility(View.INVISIBLE);
    }
}
