package edu.vassar.cmpu203.datingsim.persistence;

import android.util.Log;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.Characters;
import edu.vassar.cmpu203.datingsim.model.Player;

public class LocalStorageFacade implements IPersistenceFacade {

    private final File file;
    private static final String FILENAME = "TheSaveFile";
    private Characters characters;
    private Player player;


    public LocalStorageFacade(@NonNull File storageDir){
        this.file = new File(storageDir, FILENAME);
        this.player = new Player();
        this.characters = new Characters();
    }

    @Override
    public void saveCharacters(Characters characters) {
        try {
            FileOutputStream fos = new FileOutputStream(this.file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.characters);

        } catch (IOException e) {
            final String emsg = String.format("I/O error writing to %s", this.file);
            Log.e("DatinSim", emsg);
            e.printStackTrace();
        }
    }

    @Override
    public void retrieveCharacters(@NonNull Listener listener) {
        if (this.file.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(this.file);
                ObjectInputStream ois = new ObjectInputStream(fis);

                this.characters = (Characters) ois.readObject(); // extract ledger from file
                listener.onCharactersReceived(this.characters); // tell the listener about it

            } catch (IOException e) {
                final String emsg = String.format("I/O error writing to %s", this.file);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                final String emsg = String.format("Can't find class of object from %s", this.file);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            }
        }
    }

    @Override
    public void savePlayer(Player player) {
        try {
            FileOutputStream fos = new FileOutputStream(this.file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.player);

        } catch (IOException e) {
            final String emsg = String.format("I/O error writing to %s", this.file);
            Log.e("DatingSim", emsg);
            e.printStackTrace();
        }

    }

    @Override
    public void retrievePlayer(@NonNull Listener listener) {
        if (this.file.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(this.file);
                ObjectInputStream ois = new ObjectInputStream(fis);

                this.characters = (Characters) ois.readObject(); // extract ledger from file
                listener.onCharactersReceived(this.characters); // tell the listener about it

            } catch (IOException e) {
                final String emsg = String.format("I/O error writing to %s", this.file);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                final String emsg = String.format("Can't find class of object from %s", this.file);
                Log.e("DatingSim", emsg);
                e.printStackTrace();
            }
        }
    }
}
