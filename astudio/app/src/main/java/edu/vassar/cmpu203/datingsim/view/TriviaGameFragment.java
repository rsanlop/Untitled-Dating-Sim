package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTriviaGameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentZeusBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TriviaGameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TriviaGameFragment extends Fragment implements ITriviaGameView {

    FragmentTriviaGameBinding binding;
    Listener listener;


    public TriviaGameFragment(Listener listener) {
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
        this.binding = FragmentTriviaGameBinding.inflate(inflater);
        this.binding.triviaNextButton.setOnClickListener(v -> listener.onClickedNext());
        return this.binding.getRoot();
    }
}