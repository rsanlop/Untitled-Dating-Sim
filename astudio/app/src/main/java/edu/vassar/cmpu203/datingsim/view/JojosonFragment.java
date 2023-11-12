package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentJojosonBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentZeusBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JojosonFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JojosonFragment extends Fragment implements IJojosonView {

    FragmentJojosonBinding binding;
    Listener listener;


    public JojosonFragment(Listener listener) {
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
        this.binding = FragmentJojosonBinding.inflate(inflater);
        this.binding.jojosonDateButton.setOnClickListener(v -> listener.onClickedDate());
        return this.binding.getRoot();
    }

}