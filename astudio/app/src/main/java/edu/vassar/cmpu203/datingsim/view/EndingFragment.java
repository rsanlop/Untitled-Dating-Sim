package edu.vassar.cmpu203.datingsim.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentCharacterBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentEndingBinding;
import edu.vassar.cmpu203.datingsim.model.Character;

/**
 */
public class EndingFragment extends Fragment implements IEndingView {

    FragmentEndingBinding binding;
    Listener listener;
    private Character character;

    public EndingFragment(Listener listener, Character character) {
        this.listener = listener;
        this.character = character;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentEndingBinding.inflate(inflater);
        this.binding.doneButton.setOnClickListener(v -> listener.onClickedDone());
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Drawable charImage;
        super.onViewCreated(view, savedInstanceState);
        this.binding.characterName2.setText(character.getName());
        this.binding.characterAffection2.setText(character.getAffection());
        this.binding.characterDialogue2.setText(getEnding());
        charImage = this.binding.getRoot().getContext().getDrawable(character.getImageId());
        this.binding.characterImage2.setImageDrawable(charImage);

    }

    public String getEnding(){
        if(character.getIntAffection() >= 50){
            return character.getDialogue().get(3);
        }
        else{
            return character.getDialogue().get(4);
        }

    }
}
