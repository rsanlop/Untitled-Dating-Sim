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
import java.util.Random;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentCharacterBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentStatsBinding;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.IMiniGame;

/**
 */
public class StatsFragment extends Fragment implements IStatsView{

    FragmentStatsBinding binding;
    Listener listener;
    private Character character;
    private IMiniGame minigame;
    boolean result;

    public StatsFragment(Listener listener, Character character, boolean result, IMiniGame minigame) {
        this.listener = listener;
        this.minigame = minigame;
        this.character = character;
        this.result = result;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentStatsBinding.inflate(inflater);
        this.binding.statsNextButton.setOnClickListener(v -> listener.onClickedNext());
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Drawable charImage;
        super.onViewCreated(view, savedInstanceState);
        this.binding.resultText.setText(minigame.getResult(result));
        character.incAffection(minigame.getPoints(result));
        this.binding.affectionPoints.setText(character.getAffection());

    }
}