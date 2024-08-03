class Player{

    private String name;
    private int x;
    private int y;
    private String state = "Idle";

    public Player(String nameGiven){

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

}