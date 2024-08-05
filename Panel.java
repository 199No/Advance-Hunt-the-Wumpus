import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Panel extends JPanel {

    private int playerX = 0;
    private int playerY = 0;
    public Player tempPlayer;

    //Frame Counters
    private int IdleFrameCounter = 1;
    private int WalkingFrameCounter = 1;
    private int RunningFrameCounter = 1;
    private int JumpingFrameCounter = 1;
    private int DeathFrameCounter = 1;
    private int HurtFrameCounter = 1;
    private int AttackFrameCounter = 1;


    //Background postion ints
    private int Background1_Xint = 0;
    private int Background2_Xint = 576;
    private int Background3_Xint = 1152;
    private int Background4_Xint = 1728;
    private int Background5_Xint = 2304;
    private int Background6_Xint = 2880;
    private int Background7_Xint = 3456;
    private int Background8_Xint = 4032;

    //Extra IMages int
    private int coin1X = 100;



    //Images
    private Image Background1;
    private Image Background2;
    private Image Background3;
    private Image Background4;
    private Image Background5;
    private Image Background6;
    private Image Background7;
    private Image Background8;

    private Image coin1;

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

    private Image Player_Running_1;
    private Image Player_Running_2;
    private Image Player_Running_3;
    private Image Player_Running_4;
    private Image Player_Running_5;
    private Image Player_Running_6;

    private Image Player_Jumping_1;
    private Image Player_Jumping_2;
    private Image Player_Jumping_3;
    private Image Player_Jumping_4;
    private Image Player_Jumping_5;
    private Image Player_Jumping_6;

    private Image Player_Death_1;
    private Image Player_Death_2;
    private Image Player_Death_3;
    private Image Player_Death_4;
    private Image Player_Death_5;
    private Image Player_Death_6;

    private Image Player_Hurt_1;
    private Image Player_Hurt_2;
    private Image Player_Hurt_3;

    private Image Player_Attack_1;
    private Image Player_Attack_2;
    private Image Player_Attack_3;
    private Image Player_Attack_4;
    private Image Player_Attack_5;
    private Image Player_Attack_6;



    public Panel(Player playerPlayer) {



        //Setting Player
        tempPlayer = playerPlayer;

        //Background Images     
        Background1 = Toolkit.getDefaultToolkit().getImage("Background\\Background1.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background2 = Toolkit.getDefaultToolkit().getImage("Background\\Background2.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background3 = Toolkit.getDefaultToolkit().getImage("Background\\Background3.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background4 = Toolkit.getDefaultToolkit().getImage("Background\\Background4.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background5 = Toolkit.getDefaultToolkit().getImage("Background\\Background5.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background6 = Toolkit.getDefaultToolkit().getImage("Background\\Background6.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background7 = Toolkit.getDefaultToolkit().getImage("Background\\Background7.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);
        Background8 = Toolkit.getDefaultToolkit().getImage("Background\\Background8.png").getScaledInstance(576, 324, Image.SCALE_DEFAULT);


        //Misc Images
        coin1 = Toolkit.getDefaultToolkit().getImage("Objects\\Coin1.gif").getScaledInstance(75, 75, Image.SCALE_DEFAULT);

        //Player Images 
        Player_Idle_1 = Toolkit.getDefaultToolkit().getImage("Player_Idle\\Player_Idle_1.png").getScaledInstance(72, 97, Image.SCALE_DEFAULT);
        Player_Idle_2 = Toolkit.getDefaultToolkit().getImage("Player_Idle\\Player_Idle_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Idle_3 = Toolkit.getDefaultToolkit().getImage("Player_Idle\\Player_Idle_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Idle_4 = Toolkit.getDefaultToolkit().getImage("Player_Idle\\Player_Idle_4.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        
        Player_Walking_1 = Toolkit.getDefaultToolkit().getImage("Player_Walking\\Player_Walking_1.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Walking_2 = Toolkit.getDefaultToolkit().getImage("Player_Walking\\Player_Walking_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Walking_3 = Toolkit.getDefaultToolkit().getImage("Player_Walking\\Player_Walking_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Walking_4 = Toolkit.getDefaultToolkit().getImage("Player_Walking\\Player_Walking_4.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Walking_5 = Toolkit.getDefaultToolkit().getImage("Player_Walking\\Player_Walking_5.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Walking_6 = Toolkit.getDefaultToolkit().getImage("Player_Walking\\Player_Walking_6.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);

        Player_Running_1 = Toolkit.getDefaultToolkit().getImage("Player_Running\\Player_Running_1.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Running_2 = Toolkit.getDefaultToolkit().getImage("Player_Running\\Player_Running_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Running_3 = Toolkit.getDefaultToolkit().getImage("Player_Running\\Player_Running_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Running_4 = Toolkit.getDefaultToolkit().getImage("Player_Running\\Player_Running_4.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Running_5 = Toolkit.getDefaultToolkit().getImage("Player_Running\\Player_Running_5.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Running_6 = Toolkit.getDefaultToolkit().getImage("Player_Running\\Player_Running_6.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);

        Player_Jumping_1 = Toolkit.getDefaultToolkit().getImage("Player_Jumping\\Player_Jump_1.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Jumping_2 = Toolkit.getDefaultToolkit().getImage("Player_Jumping\\Player_Jump_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Jumping_3 = Toolkit.getDefaultToolkit().getImage("Player_Jumping\\Player_Jump_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Jumping_4 = Toolkit.getDefaultToolkit().getImage("Player_Jumping\\Player_Jump_4.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Jumping_5 = Toolkit.getDefaultToolkit().getImage("Player_Jumping\\Player_Jump_5.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Jumping_6 = Toolkit.getDefaultToolkit().getImage("Player_Jumping\\Player_Jump_6.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);

        Player_Death_1 = Toolkit.getDefaultToolkit().getImage("Player_Death\\Player_Death_1.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Death_2 = Toolkit.getDefaultToolkit().getImage("Player_Death\\Player_Death_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Death_3 = Toolkit.getDefaultToolkit().getImage("Player_Death\\Player_Death_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Death_4 = Toolkit.getDefaultToolkit().getImage("Player_Death\\Player_Death_4.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Death_5 = Toolkit.getDefaultToolkit().getImage("Player_Death\\Player_Death_5.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Death_6 = Toolkit.getDefaultToolkit().getImage("Player_Death\\Player_Death_6.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);

        Player_Hurt_1 = Toolkit.getDefaultToolkit().getImage("Player_Hurt\\Player_Hurt_1.png").getScaledInstance(72, 97, Image.SCALE_DEFAULT);
        Player_Hurt_2 = Toolkit.getDefaultToolkit().getImage("Player_Hurt\\Player_Hurt_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Hurt_3 = Toolkit.getDefaultToolkit().getImage("Player_Hurt\\Player_Hurt_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);

        Player_Attack_1 = Toolkit.getDefaultToolkit().getImage("Player_Attack\\Player_Attack_1.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Attack_2 = Toolkit.getDefaultToolkit().getImage("Player_Attack\\Player_Attack_2.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Attack_3 = Toolkit.getDefaultToolkit().getImage("Player_Attack\\Player_Attack_3.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Attack_4 = Toolkit.getDefaultToolkit().getImage("Player_Attack\\Player_Attack_4.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Attack_5 = Toolkit.getDefaultToolkit().getImage("Player_Attack\\Player_Attack_5.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);
        Player_Attack_6 = Toolkit.getDefaultToolkit().getImage("Player_Attack\\Player_Attack_6.png").getScaledInstance(72, 97,  Image.SCALE_DEFAULT);

    }


    public void moveBackgroundRightWalk(){
        Background1_Xint -= 5;
        Background2_Xint -= 5;
        Background3_Xint -= 5;
        Background4_Xint -= 5;
        Background5_Xint -= 5;
        Background6_Xint -= 5;
        Background7_Xint -= 5;
        Background8_Xint -= 5;

        coin1X -= 5;
    }
    public void moveBackgroundLeftWalk(){
        Background1_Xint += 5;
        Background2_Xint += 5;
        Background3_Xint += 5;
        Background4_Xint += 5;
        Background5_Xint += 5;
        Background6_Xint += 5;
        Background7_Xint += 5;
        Background8_Xint += 5;

        coin1X += 5;


    }

    public void moveBackgroundRightRun(){
        Background1_Xint -= 10;
        Background2_Xint -= 10;
        Background3_Xint -= 10;
        Background4_Xint -= 10;
        Background5_Xint -= 10;
        Background6_Xint -= 10;
        Background7_Xint -= 10;
        Background8_Xint -= 10;
        coin1X -= 10;

    }
    public void moveBackgroundLeftRun(){
        Background1_Xint += 10;
        Background2_Xint += 10;
        Background3_Xint += 10;
        Background4_Xint += 10;
        Background5_Xint += 10;
        Background6_Xint += 10;
        Background7_Xint += 10;
        Background8_Xint += 10;

        coin1X += 10;


    }
    
    
    public void playerStatePanel(String givenState){
        tempPlayer.setState(givenState);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Drawing background
        g.drawImage(Background1, Background1_Xint, 0, this);
        g.drawImage(Background2, Background2_Xint, 0, this);
        g.drawImage(Background3, Background3_Xint, 0, this);
        g.drawImage(Background4, Background4_Xint, 0, this);
        g.drawImage(Background5, Background5_Xint, 0, this);
        g.drawImage(Background6, Background6_Xint, 0, this);
        g.drawImage(Background7, Background7_Xint, 0, this);
        g.drawImage(Background8, Background8_Xint, 0, this);



        //Drawing A ref Image
        g.drawImage(coin1, coin1X, 25, this);

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
                tempPlayer.setState("Idle");
            }
        }
        if(tempPlayer.getState() == "Running"){
            
            //Depending on Frame Counter
            if(RunningFrameCounter == 1){
                g.drawImage(Player_Running_1, tempPlayer.getX(), tempPlayer.getY(), this);
                RunningFrameCounter = 2;
            }
            else if(RunningFrameCounter == 2){
                g.drawImage(Player_Running_2, tempPlayer.getX(), tempPlayer.getY(), this);
                RunningFrameCounter = 3;
            }
            else if(RunningFrameCounter == 3){
                g.drawImage(Player_Running_3, tempPlayer.getX(), tempPlayer.getY(), this);
                RunningFrameCounter = 4;
            }
            else if(RunningFrameCounter == 4){
                g.drawImage(Player_Running_4, tempPlayer.getX(), tempPlayer.getY(), this);
                RunningFrameCounter = 5;
            }
            else if(RunningFrameCounter == 5){
                g.drawImage(Player_Running_5, tempPlayer.getX(), tempPlayer.getY(), this);
                RunningFrameCounter = 6;
            }
            else if(RunningFrameCounter == 6){
                g.drawImage(Player_Running_6, tempPlayer.getX(), tempPlayer.getY(), this);
                RunningFrameCounter = 1;
                tempPlayer.setState("Idle");
            }
        }
        if(tempPlayer.getState() == "Jumping"){
            
            //Depending on Frame Counter
            if(JumpingFrameCounter == 1){
                g.drawImage(Player_Jumping_1, tempPlayer.getX(), tempPlayer.getY(), this);
                JumpingFrameCounter = 2;
            }
            else if(JumpingFrameCounter == 2){
                g.drawImage(Player_Jumping_2, tempPlayer.getX(), tempPlayer.getY(), this);
                JumpingFrameCounter = 3;
            }
            else if(JumpingFrameCounter == 3){
                g.drawImage(Player_Jumping_3, tempPlayer.getX(), tempPlayer.getY(), this);
                JumpingFrameCounter = 4;
            }
            else if(JumpingFrameCounter == 4){
                g.drawImage(Player_Jumping_4, tempPlayer.getX(), tempPlayer.getY(), this);
                JumpingFrameCounter = 5;
            }
            else if(JumpingFrameCounter == 5){
                g.drawImage(Player_Jumping_5, tempPlayer.getX(), tempPlayer.getY(), this);
                JumpingFrameCounter = 6;
            }
            else if(JumpingFrameCounter == 6){
                g.drawImage(Player_Jumping_6, tempPlayer.getX(), tempPlayer.getY(), this);
                JumpingFrameCounter = 1;
                tempPlayer.setState("Idle");
            }
        }
        if(tempPlayer.getState() == "Death"){
            
            //Depending on Frame Counter
            if(DeathFrameCounter == 1){
                g.drawImage(Player_Death_1, tempPlayer.getX(), tempPlayer.getY(), this);
                DeathFrameCounter = 2;
            }
            else if(DeathFrameCounter == 2){
                g.drawImage(Player_Death_2, tempPlayer.getX(), tempPlayer.getY(), this);
                DeathFrameCounter = 3;
            }
            else if(DeathFrameCounter == 3){
                g.drawImage(Player_Death_3, tempPlayer.getX(), tempPlayer.getY(), this);
                DeathFrameCounter = 4;
            }
            else if(DeathFrameCounter == 4){
                g.drawImage(Player_Death_4, tempPlayer.getX(), tempPlayer.getY(), this);
                DeathFrameCounter = 5;
            }
            else if(DeathFrameCounter == 5){
                g.drawImage(Player_Death_5, tempPlayer.getX(), tempPlayer.getY(), this);
                DeathFrameCounter = 6;
            }
            else if(DeathFrameCounter == 6){
                g.drawImage(Player_Death_6, tempPlayer.getX(), tempPlayer.getY(), this);
                DeathFrameCounter = 1;
                tempPlayer.setState("Idle");
            }
        }
        if(tempPlayer.getState() == "Hurt"){

            //Depending on Frame Counter
            if(HurtFrameCounter == 1){
                g.drawImage(Player_Hurt_1, tempPlayer.getX(), tempPlayer.getY(), this);
                HurtFrameCounter = 2;
            }
            else if(HurtFrameCounter == 2){
                g.drawImage(Player_Hurt_2, tempPlayer.getX(), tempPlayer.getY(), this);
                HurtFrameCounter = 3;
            }
            else if(HurtFrameCounter == 3){
                g.drawImage(Player_Hurt_3, tempPlayer.getX(), tempPlayer.getY(), this);
                HurtFrameCounter = 1;
                tempPlayer.setState("Idle");
            }

        }
        if(tempPlayer.getState() == "Attack"){
            
            //Depending on Frame Counter
            if(AttackFrameCounter == 1){
                g.drawImage(Player_Attack_1, tempPlayer.getX(), tempPlayer.getY(), this);
                AttackFrameCounter = 2;
            }
            else if(AttackFrameCounter == 2){
                g.drawImage(Player_Attack_2, tempPlayer.getX(), tempPlayer.getY(), this);
                AttackFrameCounter = 3;
            }
            else if(AttackFrameCounter == 3){
                g.drawImage(Player_Attack_3, tempPlayer.getX(), tempPlayer.getY(), this);
                AttackFrameCounter = 4;
            }
            else if(AttackFrameCounter == 4){
                g.drawImage(Player_Attack_4, tempPlayer.getX(), tempPlayer.getY(), this);
                AttackFrameCounter = 5;
            }
            else if(AttackFrameCounter == 5){
                g.drawImage(Player_Attack_5, tempPlayer.getX(), tempPlayer.getY(), this);
                AttackFrameCounter = 6;
            }
            else if(AttackFrameCounter == 6){
                g.drawImage(Player_Attack_6, tempPlayer.getX(), tempPlayer.getY(), this);
                AttackFrameCounter = 1;
                tempPlayer.setState("Idle");
            }
        }

    }
}