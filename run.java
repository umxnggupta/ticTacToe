package tictactoe;

import java.util.Scanner;

public class run extends conditon
{
    // int playerturn=1; why does this change value each time 
    public void run2()
    {
        int m=compcase(); System.out.println(m +"human");
        String p;
        object object2=new object();
        Scanner sc=new Scanner(System.in);
        if(m==1)
        {
            System.out.println("Enter player name"); 
            p=sc.nextLine();
            object2.setPlayer1(p);
            object2.setPlayer2("Computer");
            object2.setHuman(1);
        }
        else if(m==2)
        {
            System.out.println("Enter player 1 name"); 

            String p1=sc.nextLine();
            System.out.println("Enter player 2 name");
            String p2=sc.nextLine();
            object2.setPlayer1(p1);
            object2.setPlayer2(p2);
            object2.setHuman(2);
        }
        System.out.println("note in run2");
    }



    public object enteryhelp(int[][] arr,int c)
    { 
        Player1 object1=new Player1();
        object object2=new object();
        //  object2.setNumberOfMove(playerturn);
        if(c%2!=0)
        {
            System.out.println("Move for  " +object2.getPlayer1() );
            int move=object1.entery(arr);
            object2.setMove(move);
            System.out.println(c + "...................................");
            // playerturn++;
           
        }
        else if(c%2==0)
        {
            int humancheck=object2.getHuman();
            if(humancheck==1)
            {
                 System.out.println("Computer's move");
                comp object3=new comp();
                int move=object3.easy(arr);
                System.out.println(move+"=move by computer");
                object2.setMove(move);
               
                
                
                
            }
            if(humancheck==2) 
            {
                System.out.println("Move for" +object2.getPlayer2());
                int move=object1.entery(arr);
                object2.setMove(move);
                
                
            }
        }
         System.out.println(c + "...................................");
        return object2;
    }
    
}
