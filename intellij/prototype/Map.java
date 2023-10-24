/**
 * Map class which contains character's locations
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/10/2023
 */

public class Map {

    List<String> maplist = new ArrayList<String>(zeus.location, shruck.location, bonny.location,
            satan.location, jojoson.location);
    public Map(){}
    public String getMap(){
        System.out.println(map);
        String map = maplist.toString();
        System.out.println("Map: " + map);
    }

}