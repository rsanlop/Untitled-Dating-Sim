package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentBonnyBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentZeusBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BonnyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BonnyFragment extends Fragment implements IBonnyView {

    FragmentBonnyBinding binding;
    Listener listener;


    public BonnyFragment(Listener listener) {
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
        this.binding = FragmentBonnyBinding.inflate(inflater);
        this.binding.bonnyDateButton.setOnClickListener(v -> listener.onClickedDate());
        return this.binding.getRoot();
    }

}