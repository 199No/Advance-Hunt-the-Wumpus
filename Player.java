class Player{
    private Panel panel;
    private String name;
    private int x = 218;
    private int y = 198;
    private String state = "Idle";

    //Possible States
    //# Idle
    //# Walking
    //# Running
    //# Jumping
    //# Death
    //# Hurt


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

    //////////////////////
    // Getters
    //////////////////////

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
    public void moveRight(){
        panel.playerStatePanel("Walking");
        panel.moveBackgroundRight();
        
    }
    //Increase the x vaule method
    public void moveLeft(){
        panel.playerStatePanel("Walking");
        panel.moveBackgroundLeft();
        
    }
    public void attack(){
        panel.playerStatePanel("Attack");

    }

}