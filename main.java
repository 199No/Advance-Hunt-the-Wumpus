//2d runner but with wacky power ups 

//Power ups
//ALot of coins
//Invert Gravirty
//etc


public class main {

    public static void main(String[] args){

        

        Player bob = new Player("Bob");

        // Create the Gui frame
        Gui gui = new Gui();

        // Create the Panel
        Panel panel = new Panel(bob);
        
        bob.setPanel(panel);

        // Add the Panel to the Gui frame
        gui.add(panel);
        
        // Set the player position to display the coin
        System.out.println("Ran Main without Errors");
    }
}





