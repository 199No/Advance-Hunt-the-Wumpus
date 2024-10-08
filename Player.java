class Player{
    private Panel panel;
    private String direction = "Right";
    private String name;
    private int x = 100;
    private int y = 190;
    private String state = "Idle";

    //Possible States
    //# Idle
    //# Walking
    //# Running
    //# Jumping
    //# Death $
    //# Hurt  $
    //# Attack


    public Player(String nameGiven){

        name = nameGiven;

    }
    public Player(){

        name = "None";

    }
    public Player(Panel thePanel){

        panel = thePanel;

    }
    public Player(Panel thePanel, String nameGiven){

        panel = thePanel;
        name = nameGiven;

    }

    //////////////////////
    // Setters
    //////////////////////

    //Method sets both Values
    public void setPostion(int xGiven, int yGiven){

        //Setting old values to new given ones
        x = xGiven;
        y = yGiven;

        

    }

    //Method sets One value (x)
    public void setXVaule(int xGiven){
        x = xGiven;
    }

    //Method sets State
    public void setState(String stateGiven){
        state = stateGiven;
    }

    //Method sets One value (y)
    public void setYVaule(int yGiven){
        y = yGiven;
    }

    //Set Name Method
    public void setName(String nameGiven){
        name = nameGiven;
    }

    public void setDirection(String givenDirection){
        direction = givenDirection;
    }

    //////////////////////
    // Getters
    //////////////////////

    public String getDirection(){
        return direction;
    }
    
    //Method Returns x
    public int getX(){
        return x;
    }

    //Method Returns State
    public String getState(){
        return state;
    }

    //Method Returns y
    public int getY(){
        return y;
    }

    //Method Returns Names
    public String getName(){
        return name;
    }

    //Set Panel
    public void setPanel(Panel thePanel){
        panel = thePanel;
    }

    ///////////////////////
    // Movement Methods
    ///////////////////////

    //Increase the y vaule method
    public void moveUp(){
        panel.playerStatePanel("Jumping");
        //Jumping is disabled for now
    }
    //Increase the x vaule method
    public void moveRightWalk(){
        panel.playerStatePanel("Walking");
        panel.moveBackgroundRightWalk();
        
    }
    //Increase the x vaule method
    public void moveLeftWalk(){
        panel.playerStatePanel("Walking");
        panel.moveBackgroundLeftWalk();
        
    }
    public void attack(){
        panel.playerStatePanel("Attack");

    }

        //Increase the x vaule method
        public void moveRightRun(){
            panel.playerStatePanel("Running");
            panel.moveBackgroundRightRun();
            
        }
        //Increase the x vaule method
        public void moveLeftRun(){
            panel.playerStatePanel("Running");
            panel.moveBackgroundLeftRun();
            
        }

}