import java.util.List;

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
    List<String> dialogue;

    public Character(String name, String location, int affection, List<String> dialogue){
        this.name = name;
        this.location = location;
        this.affection = affection;
    }
}