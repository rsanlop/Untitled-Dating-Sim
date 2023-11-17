package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentMapBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentSelectionBinding;

/**
 *
 */
public class SelectionFragment extends Fragment implements ISelectionView{

    FragmentSelectionBinding binding;

    Listener listener;

    public SelectionFragment(Listener listener) {this.listener = listener;}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentSelectionBinding.inflate(inflater);
        this.binding.shruckButton.setOnClickListener(v -> listener.onFinalClickedShruck());
        this.binding.zeusButton.setOnClickListener(v -> listener.onFinalClickedZeus());
        this.binding.bonnyButton.setOnClickListener(v -> listener.onFinalClickedBonny());
        this.binding.satanButton.setOnClickListener(v -> listener.onFinalClickedSatan());
        this.binding.jojosonButton.setOnClickListener(v -> listener.onFinalClickedJojoson());
        this.binding.aloneButton.setOnClickListener(v -> listener.onClickedAlone());
        return this.binding.getRoot();
    }
}