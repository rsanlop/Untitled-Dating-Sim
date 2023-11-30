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

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentKissingGameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTriviaGameBinding;
import edu.vassar.cmpu203.datingsim.model.Character;

/**
 */

public class KissingGameFragment extends Fragment implements IKissingGameView {

    FragmentKissingGameBinding binding;
    Listener listener;
    private Character character;

    CountDownTimer cTimer = null;

    private boolean isNoKissImage = true;


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
        this.binding.kissingNextButton.setOnClickListener(v -> listener.onClickedNext());
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

        this.binding.kissmescreen.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        cTimer = new CountDownTimer(30000, 250){
                            @Override
                            public void onTick(long millisUntilFinished) {
                                isNoKissImage = !isNoKissImage;
                                updateMainImageDrawable();
                            }

                            @Override
                            public void onFinish() {
                                // Handle onFinish if needed
                            }
                        };
                        cTimer.start();
                        break;
                    case MotionEvent.ACTION_UP:
                        // when user lifts finger
                        if (cTimer != null) {
                            cTimer.cancel();
                        }
                        resetMainImageDrawable();
                        break;
                }
                return true;
            }
        });

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


}