package tictactoe;

public class tictac {
    
    public static void main(String[] args)
    {
       
        int[][]  arr=new int[3][3];
    
        int c=1;
        var obj3=new Logic1(); 
        var obj4=new print1();
        var obj9 =new run();
        obj9.run2();
        while(obj3.draw(arr)==-2&&obj3.Check(arr)==0)
        {
           
            obj4.print(arr);
            obj3.update(arr,c);
            c++;
        }
        if(obj3.Check(arr)!=1)
        {
            System.out.println("win");
        }
        if(obj3.draw(arr)==-2)
        {
            System.out.println("draw");
        }
    } 
}
