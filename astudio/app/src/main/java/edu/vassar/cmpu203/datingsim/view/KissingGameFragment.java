package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentKissingGameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTriviaGameBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KissingGameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class KissingGameFragment extends Fragment implements IKissingGameView {

    FragmentKissingGameBinding binding;
    Listener listener;


    public KissingGameFragment(Listener listener) {
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
        this.binding = FragmentKissingGameBinding.inflate(inflater);
        this.binding.kissingNextButton.setOnClickListener(v -> listener.onClickedNext());
        return this.binding.getRoot();
    }
}