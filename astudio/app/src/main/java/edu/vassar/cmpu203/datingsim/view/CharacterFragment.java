package edu.vassar.cmpu203.datingsim.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.databinding.FragmentCharacterBinding;
import edu.vassar.cmpu203.datingsim.databinding.FragmentShruckBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CharacterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CharacterFragment extends Fragment implements ICharacterView{

    // TODO: Rename and change types of parameters
    private String name;
    private String dialogue;
    private String affection;
    FragmentCharacterBinding binding;
    Listener listener;

    public CharacterFragment(Listener listener, String name, String dialogue, String affection) {
        this.listener = listener;
        this.name = name;
        this.dialogue = dialogue;
        this.affection = affection;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character, container, false);
    }
}