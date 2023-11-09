package edu.vassar.cmpu203.datingsim.view;
import android.view.View;
import androidx.fragment.app.Fragment;

public interface IActivityMainView {

    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */

    interface Listener {

        void onSettingsClick();

        /*
             @Override
             public void onAddedName(String name) {
                 this.addNameView.updateNameDisplay(curPlayer); // tell ui to update itself
             }*/

    }

    View getRootView();

    /**
     * Replaces the contents of the screen's fragment container with the one passed in as an argument.
     *
     * @param fragment The fragment to be displayed.
     * @param reversible true if this transaction should be reversible, false otherwise
     * @param name the name this transaction can be referred by.
     */
    void displayFragment(Fragment fragment, boolean reversible, String name);

    //void onViewCreated();

    void hideMenu();
    void showMenu();
}




