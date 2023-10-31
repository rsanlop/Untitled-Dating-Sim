package edu.vassar.cmpu203.datingsim.view;
import android.view.View;
import edu.vassar.cmpu203.datingsim.model.Player;

public interface IAddNameView {

    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */
    interface Listener {
        /**
         *
         *
         * @param name name of player
         */
        void onAddedName(String name);
    }

    /**
     * Returns the screen's top-level view.
     * @return The screen's top-level view.
     */
    View getRootView();

    /**
     * Update display to reflect contents
     * @param name name of the player
     */
    void updateNameDisplay(Player player);
}


