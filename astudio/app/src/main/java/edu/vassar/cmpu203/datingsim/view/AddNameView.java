package edu.vassar.cmpu203.datingsim.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import edu.vassar.cmpu203.datingsim.databinding.ActivityMainBinding;

public class AddNameView implements IAddNameView {
    ActivityMainBinding binding;

    public void AddNameView(Context context){
        this.binding = ActivityMainBinding.inflate(LayoutInflater.from(context));
    }
    public View getRootView() { return binding.getRoot(); }
}
