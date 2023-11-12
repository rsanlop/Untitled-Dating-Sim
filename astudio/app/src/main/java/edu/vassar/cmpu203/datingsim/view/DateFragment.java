package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentDateBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentKissingGameBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DateFragment extends Fragment implements IDateView {

    FragmentDateBinding binding;
    Listener listener;


    public DateFragment(Listener listener) {
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
        this.binding = FragmentDateBinding.inflate(inflater);
        this.binding.yesButton.setOnClickListener(v -> listener.onClickedYes());
        this.binding.noButton.setOnClickListener(v -> listener.onClickedNo());
        return this.binding.getRoot();

    }
}