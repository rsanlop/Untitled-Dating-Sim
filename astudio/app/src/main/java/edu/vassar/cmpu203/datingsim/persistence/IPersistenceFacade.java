package edu.vassar.cmpu203.datingsim.persistence;

import androidx.annotation.NonNull;

import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.Characters;
import edu.vassar.cmpu203.datingsim.model.Player;

public interface IPersistenceFacade {

    interface Listener {
        void onCharactersReceived(@NonNull Characters characters);
    }


    /**
     * Issues a characters save operation.
     * @param characters the character to be saved.
     */
    void saveCharacters(Characters characters);

    /**
     * Issues a character retrieval operation.
     * @return the retrieved character.
     */
    void retrieveCharacters(@NonNull Listener listener);

    /**
     * Issues a player save operation.
     * @param player the player to be saved.
     */
    void savePlayer(Player player);
    /**
     * Issues a character retrieval operation.
     * @return the retrieved character.
     */
    void retrievePlayer(@NonNull Listener listener);



}


