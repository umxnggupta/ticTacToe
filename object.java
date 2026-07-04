package tictactoe;

public class object 
{
   static String player1="a",player2="B";
    int move,numberOfMove;
    static int human;

    //     public int getNumberOfMove() {
    //     return numberOfMove;
    // }
    // public void setNumberOfMove(int numberOfMove) {
    //     this.numberOfMove = numberOfMove;
    // }
        public int getHuman() 
        {
        return human;
    }
    public void setHuman(int human) {
        object.human = human;
    }
    public String getPlayer1() 
    {
        return player1;
    }
    public void setPlayer1(String player1) {
        object.player1 = player1;
    }
    public String getPlayer2() {
        return player2;
    }
    public void setPlayer2(String player2) {
        object.player2 = player2;
    }
    public int getMove() {
        return move;
    }
    public void setMove(int move) {
        this.move = move;
    }
}
