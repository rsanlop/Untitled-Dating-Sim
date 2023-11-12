package edu.vassar.cmpu203.datingsim.view;

public interface INameView {

    interface Listener{
        void onAddedName(String name, INameView view);

    }
}
