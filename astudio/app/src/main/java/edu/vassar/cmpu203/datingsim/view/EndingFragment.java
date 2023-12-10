package edu.vassar.cmpu203.datingsim.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.databinding.FragmentEndingBinding;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.Endings;
import edu.vassar.cmpu203.datingsim.model.Player;

/**
 */
public class EndingFragment extends Fragment implements IEndingView {

    FragmentEndingBinding binding;
    Listener listener;
    private Character character;
    private Endings endings;
    private Player player;

    public EndingFragment(Listener listener, Character character, Player player) {
        this.listener = listener;
        this.character = character;
        this.player = player;
        this.endings = new Endings();

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
        this.binding.characterDialogue2.setText(getResultEnding());
        this.binding.endingDialogue.setText(player.getName() + endings.getEnding(character.getIntAffection()));
        charImage = this.binding.getRoot().getContext().getDrawable(getResultImage());
        this.binding.characterImage2.setImageDrawable(charImage);

    }

    public String getResultEnding(){
        if(character.getIntAffection() >= 50){
            return character.getDialogue().get(3);
        }
        else{
            return character.getDialogue().get(4);
        }

    }

    public int getResultImage(){
        if(character.getIntAffection() >= 50){
            return character.getGoodEndingImageId();
        }
        else{
            return character.getBadEndingImageId();
        }
    }

}
