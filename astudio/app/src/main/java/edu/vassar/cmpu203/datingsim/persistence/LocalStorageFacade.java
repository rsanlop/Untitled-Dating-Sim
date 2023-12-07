package edu.vassar.cmpu203.datingsim.persistence;

import android.util.Log;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.vassar.cmpu203.datingsim.model.AllCharacters;
import edu.vassar.cmpu203.datingsim.model.Player;

public class LocalStorageFacade implements IPersistenceFacade {

    private final File fileChars;
    private final File filePlayer;
    private static final String CHARS_FNAME = "CharactersTheSaveFile";
    private static final String PLAYER_FNAME = "PlayerTheSaveFile";
    private AllCharacters characters;
    private Player player;


    public LocalStorageFacade(@NonNull File storageDir){
        this.fileChars = new File(storageDir, CHARS_FNAME);
        this.filePlayer = new File(storageDir, PLAYER_FNAME);
        this.player = new Player();
        this.characters = new AllCharacters();
    }

    @Override
    public void saveCharacters(AllCharacters characters) {
        this.characters = characters;
        try {
            FileOutputStream fos = new FileOutputStream(this.fileChars);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.characters);

        } catch (IOException e) {
            final String emsg = String.format("I/O error writing to %s", this.fileChars);
            Log.e("DatinSim", emsg);
            e.printStackTrace();
        }
    }

    @Override
    public void retrieveCharacters(@NonNull Listener listener) {
        if (this.fileChars.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(this.fileChars);
                ObjectInputStream ois = new ObjectInputStream(fis);

                this.characters = (AllCharacters) ois.readObject(); // extract ledger from file
                listener.onCharactersReceived(this.characters); // tell the listener about it

            } catch (IOException e) {
                final String emsg = String.format("I/O error writing to %s", this.fileChars);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                final String emsg = String.format("Can't find class of object from %s", this.fileChars);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            }
        }
    }

    @Override
    public void savePlayer(Player player) {
        this.player = player;
        try {
            FileOutputStream fos = new FileOutputStream(this.filePlayer);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.player);

        } catch (IOException e) {
            final String emsg = String.format("I/O error writing to %s", this.filePlayer);
            Log.e("DatingSim", emsg);
            e.printStackTrace();
        }

    }

    @Override
    public void retrievePlayer(@NonNull Listener listener) {
        if (this.filePlayer.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(this.filePlayer);
                ObjectInputStream ois = new ObjectInputStream(fis);

                this.player = (Player) ois.readObject(); // extract ledger from file
                listener.onPlayerReceived(this.player); // tell the listener about it

            } catch (IOException e) {
                final String emsg = String.format("I/O error writing to %s", this.filePlayer);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                final String emsg = String.format("Can't find class of object from %s", this.filePlayer);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            }
        }
    }
}
