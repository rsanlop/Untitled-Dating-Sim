package edu.vassar.cmpu203.datingsim.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.vassar.cmpu203.datingsim.R;
import edu.vassar.cmpu203.datingsim.view.IAddNameView;
import edu.vassar.cmpu203.datingsim.view.AddNameView;

public class MainActivity extends AppCompatActivity implements IAddNameView.Listener {
    IAddNameView addNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addNameView = new AddNameView(this);
        setContentView(addNameView.getRootView());
    }
}