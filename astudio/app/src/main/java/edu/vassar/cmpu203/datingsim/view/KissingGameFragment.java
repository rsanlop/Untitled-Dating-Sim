package edu.vassar.cmpu203.datingsim.view;
//import static androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getRoot;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.GestureDetector;
import android.widget.Toast;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.os.CountDownTimer;

import java.util.Random;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentKissingGameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTriviaGameBinding;
import edu.vassar.cmpu203.datingsim.model.Character;
import edu.vassar.cmpu203.datingsim.model.KissingGame;

/**
 */

public class KissingGameFragment extends Fragment implements IKissingGameView {

    FragmentKissingGameBinding binding;
    Listener listener;
    private Character character;

    CountDownTimer cTimer = null;
    CountDownTimer donkeyTimer = null;

    private boolean isNoKissImage = true;
    private boolean isMiddleImage = false;
    private boolean isRightImage = false;
    private int kissCounter = 0;
    private int kissScore = 0;
    private int timesCaught = 0;
    private int cycles = 0;


    public KissingGameFragment(Listener listener, Character character) {
        this.listener = listener;
        this.character = character;
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentKissingGameBinding.inflate(inflater);
        return this.binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Drawable mainImage;
        Drawable smallImage;
        Drawable bigImage;

        super.onViewCreated(view, savedInstanceState);
        mainImage = this.binding.getRoot().getContext().getDrawable(character.getMainImageId());
        this.binding.mainImage.setImageDrawable(mainImage);
        smallImage = this.binding.getRoot().getContext().getDrawable(character.getSmallImageId());
        this.binding.smallImage.setImageDrawable(smallImage);
        bigImage = this.binding.getRoot().getContext().getDrawable(character.getBigImageId());
        this.binding.bigImage.setImageDrawable(bigImage);
        this.binding.kissCounter.setText("" + kissCounter);
        this.binding.kissScore.setText("" + kissScore);
        this.binding.timesCaught.setText("" + timesCaught);

        this.binding.kissmescreen.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:

                            cTimer = new CountDownTimer(30000, 100) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    if(isRightImage){
                                        resetKissScore();
                                        timesCaught += 1;
                                        updateTimesCaught();
                                    }
                                    if(timesCaught == 3){
                                        KissingGameFragment.this.listener.onGameDone(false);
                                    }
                                    isNoKissImage = !isNoKissImage;
                                    updateMainImageDrawable();
                                    kissCounter += 1;
                                    updateKissCounter();
                                }

                                @Override
                                public void onFinish() {

                                }
                            };
                        cTimer.start();

                        break;
                    case MotionEvent.ACTION_UP:
                        // when user lifts finger
                        if (cTimer != null) {
                            cTimer.cancel();
                        }
                        updateKissScore();
                        if(kissScore >= 500){
                            KissingGameFragment.this.listener.onGameDone(true);
                        }
                        resetMainImageDrawable();
                        break;
                }
                return true;
            }
        });


        donkeyTimer = new CountDownTimer(300000, 500){
            @Override
            public void onTick(long millisUntilFinished) {
                cycles += 1;
                if (cycles % 10 == 0 && !isMiddleImage){
                    updateSmallImageDrawable();
                    isMiddleImage = !isMiddleImage;
                } else if (cycles % 10 == 1 && isMiddleImage) {
                    updateSmallImageDrawable();
                    isMiddleImage = !isMiddleImage;
                }
            }

            @Override
            public void onFinish() {

            }
        };
        donkeyTimer.start();
    }
    private void resetMainImageDrawable(){
        Drawable newDrawable;
        newDrawable = this.binding.getRoot().getContext().getDrawable(character.getMainImageId());
        this.binding.mainImage.setImageDrawable(newDrawable);
    }
    private void updateMainImageDrawable() {
        Drawable newDrawable;
        if (isNoKissImage) {
            newDrawable = this.binding.getRoot().getContext().getDrawable(character.getMainImageKissId());
        } else {
            newDrawable = this.binding.getRoot().getContext().getDrawable(character.getMainImageId());
        }
        this.binding.mainImage.setImageDrawable(newDrawable);
    }
    private void updateSmallImageDrawable(){
        Drawable newDrawable;
        if (isMiddleImage) {
            double rand = Math.random();
            if(rand > 0.5){
                newDrawable = this.binding.getRoot().getContext().getDrawable(character.getSmallImageId());
            }
            else{
                newDrawable = this.binding.getRoot().getContext().getDrawable(character.getSmallRightImageId());
                isRightImage = true;
            }

        } else {
            isRightImage = false;
            newDrawable = this.binding.getRoot().getContext().getDrawable(character.getSmallFrontImageId());
        }
        this.binding.smallImage.setImageDrawable(newDrawable);
    }

    private void updateKissScore(){
        kissScore = kissCounter + kissScore;
        this.binding.kissScore.setText("" + kissScore);
        kissCounter = 0;
        this.binding.kissCounter.setText("" + kissCounter);
    }
    private void updateKissCounter(){
        this.binding.kissCounter.setText("" + kissCounter);
    }
    private void resetKissScore(){
        kissCounter = 0;
        this.binding.kissCounter.setText("" + kissCounter);
        kissScore = 0;
        this.binding.kissScore.setText("" + kissScore);
    }
    private void updateTimesCaught(){
        this.binding.timesCaught.setText("" + timesCaught);
    }


}