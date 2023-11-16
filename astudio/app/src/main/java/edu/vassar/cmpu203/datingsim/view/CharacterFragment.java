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
import edu.vassar.cmpu203.datingsim.model.Character;

/**
 *
 */
public class CharacterFragment extends Fragment implements ICharacterView{
    FragmentCharacterBinding binding;
    Listener listener;
    private Character character;

    public CharacterFragment(Listener listener,Character character) {
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
        this.binding = FragmentCharacterBinding.inflate(inflater);
        this.binding.characterScreen.setOnClickListener(v -> listener.onClickedScreen());
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Drawable charImage;
        super.onViewCreated(view, savedInstanceState);
        this.binding.characterName.setText(character.getName());
        this.binding.characterAffection.setText(character.getAffection());
        this.binding.characterDialogue.setText(getIntro(character.getDialogue()));
        charImage = this.binding.getRoot().getContext().getDrawable(character.getImageId());
        this.binding.characterImage.setImageDrawable(charImage);

    }

    public String getIntro(List<String> dialogue){return dialogue.get(0);
    }
}