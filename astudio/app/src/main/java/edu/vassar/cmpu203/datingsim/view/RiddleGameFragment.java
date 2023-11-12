package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentRiddleGameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTriviaGameBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RiddleGameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RiddleGameFragment extends Fragment implements IRiddleGameView {

    FragmentRiddleGameBinding binding;
    Listener listener;


    public RiddleGameFragment(Listener listener) {
        this.listener = listener;
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
        this.binding.riddleNextButton.setOnClickListener(v -> listener.onClickedNext());
        return this.binding.getRoot();
    }
}