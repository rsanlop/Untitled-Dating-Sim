import java.util.Scanner;
/**
 * UserInterface: controls user inputs and view
 *
 * @author Rubi Sanchez Lopez & Elizabeth Soe
 * @version 10/24/2023
 */
public class UserInterface {

    public static void main (String [] args) {
        Controller controller = new Controller();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to our awesome amazing spectacular game!" +
                " It'll be the best game you've ever played :P");
        System.out.println("Dearest Player, please enter your name:");
        String name = s.nextLine();
        System.out.println("Hello " + controller.controllerGetPlayerName(name));
        // Here we are taking in the input for name and passing it into a function
        // in the controller class that then passes it to the player class and then
        // it returns the name to the controller which returns the name to the UI
        // which we then use to display hello name to the user
        for (int i = 0; i < 11; i++) {           //This for loop is the main loop for going on dates. It will loop a total of 10 times unless a player wants to stop
            //anytime after the third date.
            if (i >= 3) {
                System.out.println("Do you wish to keep going on dates? " +
                        "\n Enter Y for yes and N for no.");
                String answer = s.nextLine();
                if (answer.equals("N")) {
                    break;
                }
            }
            System.out.println("The following is a map of locations, where you will meet your potential partners. " +
                    "Please enter the name of the location you want." + "\n");
            controller.controllerGetCharacterMap();
            //Now, we are displaying the character map in the ui through the controller that calls on the character map class which
            // refers to the map made in the game class.

            String locationInput = s.nextLine();
            String intro = "You have chosen... ";
            System.out.println(intro);
            controller.controllerGetCharacter(locationInput);
            // here we are taking in the location input and passing it to the controller to be
            // passed to the model to retrieve what character is in that location. Then we return
            // the character name along with some opening dialogue that we will add more options onto
            // later.

            System.out.println("\n\nNow its time for a mini-game! Yay!" +
                    "\n Your score on these minigames will affect the amount of affection a character feels towards you so try your best!" +
                    " \n" + "(Sidenote: we haven't implemented this yet but it'll be awesome :D)" + "\n\n" +
                    "Minigame: ");
            controller.controllerGetMinigame();
            System.out.println("\n\nWoo, that was such a good game, right? Anyways another date?");
        }
        // we randomly take a minigame from the model and return it to the controller to be returned
        // to the interface and displayed to the user

        System.out.println("Now its time to make the final decision. Who has your heart? \n " +
                "Is it Zeus? Shruck? Bonny? Satan? Scarlet Jojoson? Or perhaps, it's no one?" +
                "\n Enter the name of a character or press enter if none");
        String decisionInput = s.nextLine();
        System.out.println("You have chosen...");
        controller.controllerGetFinalCharacter(decisionInput);
        System.out.println("\n\nThanks for playing! :D");
    //here we ask for a final decision and then we send it to the controller to get the final character. after that the model
        // checks if the affection points are sufficient to get a good ending. (affection points and results will be included in the next
        // version more thoroughly as we need the minigames before that)

    }

}
