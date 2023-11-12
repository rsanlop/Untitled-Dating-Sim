package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentMapBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTitleBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MapFragment extends Fragment implements IMapView {

    FragmentMapBinding binding;

    Listener listener;

    public MapFragment(Listener listener) {this.listener = listener;}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentMapBinding.inflate(inflater);
        this.binding.swampButton.setOnClickListener(v -> listener.onClickedSwamp());
        this.binding.olympusButton.setOnClickListener(v -> listener.onClickedOlympus());
        this.binding.fredsButton.setOnClickListener(v -> listener.onClickedFreds());
        this.binding.hellButton.setOnClickListener(v -> listener.onClickedHell());
        this.binding.japanButton.setOnClickListener(v -> listener.onClickedJapan());
        return this.binding.getRoot();
    }
}