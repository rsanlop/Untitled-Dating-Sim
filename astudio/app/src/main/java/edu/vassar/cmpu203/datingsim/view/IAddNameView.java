package edu.vassar.cmpu203.datingsim.view;

import android.view.View;

public interface IAddNameView {
    interface Listener{ void onAddedName(String name, int qty); }
    public View getRootView();
}
