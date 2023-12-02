package edu.vassar.cmpu203.datingsim.model;

public interface IMiniGame {
    public String getInstructions();
    public String getName();
    public int getPoints(boolean result);
    public String getResult(boolean result);
}
