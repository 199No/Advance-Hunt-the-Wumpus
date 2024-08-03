class Player{

    private String name;
    private int x;
    private int y;

    public Player(String nameGiven){

        name = nameGiven;

    }

    //////////////////////
    // Setters
    //////////////////////

    //Method sets both Values
    public void setPostion(int xGiven, yGiven){

        //Setting old values to new given ones
        x = xGiven;
        y = yGiven;

    }

    //Method sets One value (x)
    public void setXVaule(int xGiven){
        x = xGiven;
    }

    //Method sets One value (y)
    public void setYVaule(int yGiven){
        y = yGiven;
    }

    //////////////////////
    // Getters
    //////////////////////

    //Method Returns x
    public int getX(){
        return x;
    }

    //Method Returns y
    public int getY(){
        return y;
    }

}