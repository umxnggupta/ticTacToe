package tictactoe;

public class Logic1 //extends object
{
        
    public void update(int[][] arr,int c)
    {
        
        var obj=new run();
        object information=obj.enteryhelp(arr,c);
        
        int move =information.getMove();
        int row=move/3;
            int col=move%3;

        if(c%2!=0)
        {
            
            arr[row][col]=1;
        }
        else if(c%2==0)

            {
            
            arr[row][col]=-1;
            }
    }
    public int Check(int[][] arr)
    
    {
        for(int i=0;i<3;i++)
        {
            if(arr[i][0]!=0)
            {
            int a=arr[i][0];
            int c=0;
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==a)
                {
                    c++;
                }
            }
            if(c==3)
            return 1;
            }
        }
        for(int x=0;x<3;x++)
        {
            if(arr[x][0]!=0)
            {
                    int a=arr[x][0];
                    int c=0;
                    for(int y=0;y<3;y++)
                {
                    if(arr[y][x]==a)
                    {
                        c++;
                    }
                }
                if(c==3)
                    return 1;
            }
        }
        if (arr[0][0]!=0) 
        {    
            int a=arr[0][0];
            int c=0;
            for(int i=0;i<3;i++)
            {
                if(arr[i][i]==a)
                c++;
                if(c==3)
                return 1;
            }
        }  
        if (arr[2][2]!=0) 
        {
            int r=arr[2][2];
                int c1=0;
            for(int i=2;i>=0;i--)
            {
                if(arr[i][i]==r)
                c1++;
                if(c1==3)
                return 1;
            }
        }
        return 0;
    }
    public int draw(int[][] arr)
    {
        int c=0;
        for(int i=0;i<3;i++)
        {
        
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==0)
                {
                    c++;
                }
            }
        }
        if(c==0)
        {
            System.out.println("draw");
            return -1;
        }
        else 
            return -2;
    }    
}

// -1 =  draw 
// -2=no draw 
// 1 = win 
// 0 = no win 
