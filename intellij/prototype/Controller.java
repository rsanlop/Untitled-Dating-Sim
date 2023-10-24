/**
 * Controller: takes UI inputs and sends to Model
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/24/2023
 */
public class Controller {
    public Controller(){}
    public String controllerGetPlayerName(String name){
        Player player = new Player("");
        return player.getName(name);
    }

    public void controllerGetCharacterMap(){
        Game game = new Game();
        game.makeCharacterMap();
    }

    public void controllerGetCharacter(String location){
        Game game = new Game();
        game.getCharacter(location);
    }

    public void controllerGetMinigame(){
        Game game = new Game();
        game.makeMinigame();
    }

    public void controllerGetFinalCharacter(String decision){
        Game game = new Game();
        game.getFinalCharacter(decision);
    }




}
