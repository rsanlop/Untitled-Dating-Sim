package edu.vassar.cmpu203.datingsim.view;

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

import edu.vassar.cmpu203.datingsim.databinding.FragmentRiddleGameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTriviaGameBinding;
import edu.vassar.cmpu203.datingsim.model.IMiniGame;
import edu.vassar.cmpu203.datingsim.model.RiddleGame;
import edu.vassar.cmpu203.datingsim.model.TriviaGame;

/**
 */
public class TriviaGameFragment extends Fragment implements ITriviaGameView {

    FragmentTriviaGameBinding binding;
    Listener listener;
    List<String> trivia = new ArrayList<>();
    List<String> triviaAnswers = new ArrayList<>();

    IMiniGame minigame;


    public TriviaGameFragment(Listener listener, TriviaGame minigame) {
        this.listener = listener;
        this.minigame = minigame;
        this.trivia = minigame.getTrivia();

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
        this.binding = FragmentTriviaGameBinding.inflate(inflater);
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.trivia.setText(trivia.get(0));
        for(int i = 1; i < 5; i++){
            triviaAnswers.add(trivia.get(i));
        }
        Random rand = new Random();
        int firstans = rand.nextInt(triviaAnswers.size());
        this.binding.tbutton1.setText(triviaAnswers.get(firstans));
        triviaAnswers.remove(firstans);
        int secondans = rand.nextInt(triviaAnswers.size());
        this.binding.tbutton2.setText(triviaAnswers.get(secondans));
        triviaAnswers.remove(secondans);
        int thirdans = rand.nextInt(triviaAnswers.size());
        this.binding.tbutton3.setText(triviaAnswers.get(thirdans));
        triviaAnswers.remove(thirdans);
        this.binding.tbutton4.setText(triviaAnswers.get(0));
        String tbutton1Text = this.binding.tbutton1.getText().toString();
        String tbutton2Text = this.binding.tbutton2.getText().toString();
        String tbutton3Text = this.binding.tbutton3.getText().toString();
        String tbutton4Text = this.binding.tbutton4.getText().toString();
        this.binding.tbutton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tbutton1Text.equals(trivia.get(1))){
                    TriviaGameFragment.this.listener.onGameDone(true);
                }
                else{
                    TriviaGameFragment.this.listener.onGameDone(false);}
            }
        });
        this.binding.tbutton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tbutton2Text.equals(trivia.get(1))){
                    TriviaGameFragment.this.listener.onGameDone(true);
                }
                else {
                    TriviaGameFragment.this.listener.onGameDone(false);
                }
            }
        });
        this.binding.tbutton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tbutton3Text.equals(trivia.get(1))){
                    TriviaGameFragment.this.listener.onGameDone(true);
                }
                else{
                    TriviaGameFragment.this.listener.onGameDone(false);}
            }
        });
        this.binding.tbutton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tbutton4Text.equals(trivia.get(1))){
                    TriviaGameFragment.this.listener.onGameDone(true);
                }
                else {
                    TriviaGameFragment.this.listener.onGameDone(false);
                }

            }
        });
    }
}