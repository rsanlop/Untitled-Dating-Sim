package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.ActivityMainBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTitleBinding;

public class TitleFragment extends Fragment implements ITitleView{

  FragmentTitleBinding binding;
  Listener listener;
    public TitleFragment(Listener listener) {
        this.listener = listener;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentTitleBinding.inflate(inflater);
        this.binding.startButton.setOnClickListener(v -> listener.onNewGameClicked());
        this.binding.continueButton.setOnClickListener(v -> listener.onContinueClicked());
        return this.binding.getRoot();
    }
}