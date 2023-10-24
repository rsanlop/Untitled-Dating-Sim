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
    public CharacterMap(){
        /*maplist.add(Game.zeus.location);
        maplist.add(Game.shruck.location);
        maplist.add(Game.bonny.location);
        maplist.add(Game.satan.location);
        maplist.add(Game.jojoson.location);*/
    }
    public void  addToMap(String location){
        this.maplist.add(location);
    }
    public void getMap(){
        String map = maplist.toString();
        System.out.println("Map: " + map);
    }

}