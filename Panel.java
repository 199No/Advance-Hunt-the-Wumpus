import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Panel extends JPanel {

    private int playerX = 0;
    private int playerY = 0;
    public Player tempPlayer;
    private int IdleFrameCounter = 1;
    private int WalkingFrameCounter = 1;

    //Images
    private Image coin;

    private Image Player_Idle_1;
    private Image Player_Idle_2;
    private Image Player_Idle_3;
    private Image Player_Idle_4;

    private Image Player_Walking_1;
    private Image Player_Walking_2;
    private Image Player_Walking_3;
    private Image Player_Walking_4;
    private Image Player_Walking_5;
    private Image Player_Walking_6;


    public Panel(Player playerPlayer) {



        //Setting Player
        tempPlayer = playerPlayer;

        //Misc Images
        coin = Toolkit.getDefaultToolkit().getImage("Coin.gif").getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        //Player Images
        Player_Idle_1 = Toolkit.getDefaultToolkit().getImage("Player_Idle_1.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Idle_2 = Toolkit.getDefaultToolkit().getImage("Player_Idle_2.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Idle_3 = Toolkit.getDefaultToolkit().getImage("Player_Idle_3.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Idle_4 = Toolkit.getDefaultToolkit().getImage("Player_Idle_4.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        
        Player_Walking_1 = Toolkit.getDefaultToolkit().getImage("Player_Walking_1.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Walking_2 = Toolkit.getDefaultToolkit().getImage("Player_Walking_2.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Walking_3 = Toolkit.getDefaultToolkit().getImage("Player_Walking_3.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Walking_4 = Toolkit.getDefaultToolkit().getImage("Player_Walking_4.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Walking_5 = Toolkit.getDefaultToolkit().getImage("Player_Walking_5.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);
        Player_Walking_6 = Toolkit.getDefaultToolkit().getImage("Player_Walking_6.png").getScaledInstance(100, 161, Image.SCALE_DEFAULT);




    }

    public void setPlayerPosition(int x, int y) {
        this.playerX = x;
        this.playerY = y;
        repaint(); // Request the JPanel to repaint itself
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        //Drawing A ref Image
        g.drawImage(coin, 100, 25, this);

        // Idle Animations
        if(tempPlayer.getState() == "Idle"){

            //Depending on Frame Counter
            if(IdleFrameCounter == 1){
                g.drawImage(Player_Idle_1, tempPlayer.getX(), tempPlayer.getY(), this);
                IdleFrameCounter = 2;
            }
            else if(IdleFrameCounter == 2){
                g.drawImage(Player_Idle_2, tempPlayer.getX(), tempPlayer.getY(), this);
                IdleFrameCounter = 3;
            }
            else if(IdleFrameCounter == 3){
                g.drawImage(Player_Idle_3, tempPlayer.getX(), tempPlayer.getY(), this);
                IdleFrameCounter = 4;
            }
            else if(IdleFrameCounter == 4){
                g.drawImage(Player_Idle_4, tempPlayer.getX(), tempPlayer.getY(), this);
                IdleFrameCounter = 1;
            }

        }
        if(tempPlayer.getState() == "Walking"){
            
            //Depending on Frame Counter
            if(WalkingFrameCounter == 1){
                g.drawImage(Player_Walking_1, tempPlayer.getX(), tempPlayer.getY(), this);
                WalkingFrameCounter = 2;
            }
            else if(WalkingFrameCounter == 2){
                g.drawImage(Player_Walking_2, tempPlayer.getX(), tempPlayer.getY(), this);
                WalkingFrameCounter = 3;
            }
            else if(WalkingFrameCounter == 3){
                g.drawImage(Player_Walking_3, tempPlayer.getX(), tempPlayer.getY(), this);
                WalkingFrameCounter = 4;
            }
            else if(WalkingFrameCounter == 4){
                g.drawImage(Player_Walking_4, tempPlayer.getX(), tempPlayer.getY(), this);
                WalkingFrameCounter = 5;
            }
            else if(WalkingFrameCounter == 5){
                g.drawImage(Player_Walking_5, tempPlayer.getX(), tempPlayer.getY(), this);
                WalkingFrameCounter = 6;
            }
            else if(WalkingFrameCounter == 6){
                g.drawImage(Player_Walking_6, tempPlayer.getX(), tempPlayer.getY(), this);
                WalkingFrameCounter = 1;
            }
        }
        
    }
}