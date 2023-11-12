package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentNameBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentTitleBinding;


public class NameFragment extends Fragment implements INameView {

    FragmentNameBinding binding;
    Listener listener;
    public NameFragment(Listener listener) {
        // Required empty public constructor
        this.listener = listener;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentNameBinding.inflate(inflater);
        return this.binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // register add button click listener
        this.binding.playButton.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when associated button is clicked.
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

                // retrieves item name
                final Editable nameEditable = NameFragment.this.binding.playerNameText.getText();
                final String nameStr = nameEditable.toString();

                // notify listener (controller)
                NameFragment.this.listener.onAddedName(nameStr, NameFragment.this);
            }
        });
    }

}