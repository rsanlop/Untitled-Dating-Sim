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
 * A simple {@link Fragment} subclass.
 * Use the {@link SelectionFragment#newInstance} factory method to
 * create an instance of this fragment.
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
        this.binding.shruckButton.setOnClickListener(v -> listener.onClickedShruck());
        this.binding.zeusButton.setOnClickListener(v -> listener.onClickedZeus());
        this.binding.bonnyButton.setOnClickListener(v -> listener.onClickedBonny());
        this.binding.satanButton.setOnClickListener(v -> listener.onClickedSatan());
        this.binding.jojosonButton.setOnClickListener(v -> listener.onClickedJojoson());
        this.binding.aloneButton.setOnClickListener(v -> listener.onClickedAlone());
        return this.binding.getRoot();
    }
}