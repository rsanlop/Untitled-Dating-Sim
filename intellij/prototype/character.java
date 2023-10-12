/**
 * Character Class
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class Character {
    String name;
    String location;
    int affection;
    List<String> startDialogue;
    List<String> endDialogue;

    public Character(String name, String location, int affection,List<String> dialogue, List<String> endDialogue;){
        this.name = name;
        this.location = location;
        this.affection = affection;
    }
}