package edu.vassar.cmpu203.datingsim.persistence;

import androidx.annotation.NonNull;

import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.Player;

public interface IPersistenceFacade {

    interface Listener {
        void onCharacterReceived(@NonNull Character character);
    }


    /**
     * Issues a character save operation.
     * @param character the character to be saved.
     */
    void saveCharacter(Character character, int affection);

    /**
     * Issues a character retrieval operation.
     * @return the retrieved character.
     */
    void retrieveCharacter(@NonNull Listener listener);

    /**
     * Issues a player save operation.
     * @param player the player to be saved.
     */
    void savePlayer(Player player);
    /**
     * Issues a character retrieval operation.
     * @return the retrieved character.
     */
    Player retrievePlayer();



}


