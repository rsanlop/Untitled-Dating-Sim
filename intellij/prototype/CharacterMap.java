import java.util.ArrayList;
import java.util.List;

/**
 * Map class which contains character's locations
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class CharacterMap {
    private List<String> maplist = new ArrayList<>();
    public CharacterMap(){}
    public CharacterMap(List<String> maplist){
        this.maplist = maplist;
    }
    public void addToMap(String location){
        this.maplist.add(location);
    }
    public void getMap(){
        String map = maplist.toString();
        System.out.println("Map: " + map);
    }

}