package tictactoe;

public class print1
{
    public void print(int[][] arr)
    {
        int c=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==1)
                    System.out.print("X"+ "   ");
                else if(arr[i][j]==-1)
                    System.out.print("O"+ "   ");
                else 
                    System.out.print(c+ "   ");
                c++;
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("choose postion number for move");
    }
}
