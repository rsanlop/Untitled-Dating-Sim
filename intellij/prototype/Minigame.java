/**
 * Minigame cLass that has a list of all the possible minigames
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/18/2023
 */

public class Minigame {
    List<String> minigames;

    public Minigame(List<String> minigames){

    }
    public getMinigame(){
        minigames.add("Kissing Game");
        minigames.add("Trivia Game");
        minigames.add("Riddle Game");

        Random rand = new Random();
        System.out.println(minigames[rand.nextInt(minigames.length)]);

    }
}