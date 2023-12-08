package edu.vassar.cmpu203.datingsim.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentRiddleGameBinding;
import edu.vassar.cmpu203.datingsim.model.IMiniGame;
import edu.vassar.cmpu203.datingsim.model.RiddleGame;

/**
 */
public class RiddleGameFragment extends Fragment implements IRiddleGameView {

    FragmentRiddleGameBinding binding;
    Listener listener;
    List<String> riddle = new ArrayList<>();
    List<String> riddleAnswers = new ArrayList<>();

    IMiniGame minigame;


    public RiddleGameFragment(Listener listener, RiddleGame minigame) {
        this.listener = listener;
        this.minigame = minigame;
        this.riddle = minigame.getRiddle();

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentRiddleGameBinding.inflate(inflater);
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.riddle.setText(riddle.get(0));
        for(int i = 1; i < 5; i++){
            riddleAnswers.add(riddle.get(i));
        }
        Random rand = new Random();
        int firstans = rand.nextInt(riddleAnswers.size());
        this.binding.rbutton1.setText(riddleAnswers.get(firstans));
        riddleAnswers.remove(firstans);
        int secondans = rand.nextInt(riddleAnswers.size());
        this.binding.rbutton2.setText(riddleAnswers.get(secondans));
        riddleAnswers.remove(secondans);
        int thirdans = rand.nextInt(riddleAnswers.size());
        this.binding.rbutton3.setText(riddleAnswers.get(thirdans));
        riddleAnswers.remove(thirdans);
        this.binding.rbutton4.setText(riddleAnswers.get(0));
        String rbutton1Text = this.binding.rbutton1.getText().toString();
        String rbutton2Text = this.binding.rbutton2.getText().toString();
        String rbutton3Text = this.binding.rbutton3.getText().toString();
        String rbutton4Text = this.binding.rbutton4.getText().toString();
        this.binding.rbutton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(rbutton1Text.equals(riddle.get(1))){
                    RiddleGameFragment.this.listener.onGameDone(true);
                }
                else{
                RiddleGameFragment.this.listener.onGameDone(false);}
            }
        });
        this.binding.rbutton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(rbutton2Text.equals(riddle.get(1))){
                    RiddleGameFragment.this.listener.onGameDone(true);
                }
                else {
                    RiddleGameFragment.this.listener.onGameDone(false);
                }
            }
        });
        this.binding.rbutton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(rbutton3Text.equals(riddle.get(1))){
                    RiddleGameFragment.this.listener.onGameDone(true);
                }
                else{
                RiddleGameFragment.this.listener.onGameDone(false);}
            }
        });
        this.binding.rbutton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(rbutton4Text.equals(riddle.get(1))){
                    RiddleGameFragment.this.listener.onGameDone(true);
                }
                else {
                    RiddleGameFragment.this.listener.onGameDone(false);
                }

            }
        });
    }
}