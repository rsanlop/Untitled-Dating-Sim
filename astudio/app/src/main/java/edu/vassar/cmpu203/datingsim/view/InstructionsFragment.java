package edu.vassar.cmpu203.datingsim.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.databinding.FragmentCharacterBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentInstructionsBinding;
import edu.vassar.cmpu203.datingsim.model.IMiniGame;
import edu.vassar.cmpu203.datingsim.model.Minigame;
import edu.vassar.cmpu203.datingsim.model.KissingGame;
import edu.vassar.cmpu203.datingsim.model.RiddleGame;
import edu.vassar.cmpu203.datingsim.model.TriviaGame;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InstructionsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InstructionsFragment extends Fragment implements IInstructionsView {
    FragmentInstructionsBinding binding;
    Listener listener;
    IMiniGame minigame;

    //KissingGame kissingGame;
    //TriviaGame triviaGame;
    //RiddleGame riddleGame;


    public InstructionsFragment(Listener listener, IMiniGame minigame) {
        this.listener = listener;
        this.minigame = minigame;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentInstructionsBinding.inflate(inflater);
        this.binding.instructionScreen.setOnClickListener(v -> listener.onClickedScreen());
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.gameName.setText(minigame.getName());
        this.binding.gameInstructions.setText(minigame.getInstructions());
    }

}