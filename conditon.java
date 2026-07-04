package tictactoe;

import java.util.Scanner;

public class conditon //extends Matrix1
{
     public int compcase()
    {
        int s;
        System.out.println("1: With Computer");
        System.out.println("2: With Player");
        System.out.println("Enter choice");
        Scanner sc =new Scanner(System.in);
        
         while(true)
            {
                s=sc.nextInt();
                if(s==2||s==1)
                {
                    return s;
                }
                else
                   { 
                    System.out.println("wrong entery");
                    }
            }
    }
}