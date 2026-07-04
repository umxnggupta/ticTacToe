package tictactoe;
import java.util.*;
    public class Player1
{
    public int entery(int[][] arr)
    {
        int move;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Move"); 
        move=sc.nextInt();
        if(move>8||arr[move/3][move%3]!=0)
        {
            System.out.println("Invalid move");
            entery(arr);
        }
        return move;
    }
}
    

