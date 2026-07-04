package tictactoe;

public class comp 
{
    public int easy(int[][] arr)
    {
        int move;
        move=0+(int)(Math.random()*((8-0)+1));
        if(move>8&&arr[move/3][move%3]==0)
            easy(arr);
        return move;
    }
}
// hhhh
