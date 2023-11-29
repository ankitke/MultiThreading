import java.util.*;
class Calc implements Runnable
{
    public void run()
    {
        System.out.println("Calculation task started");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter first number");
        int num1=sc.nextInt();
        System.out.println("Please enter second number");
        int num2=sc.nextInt();
        
        int res=num1+num2;
        System.out.println(res);
        System.out.println("Calculation task ended");
        
        System.out.println("********************************");
        
    }
}

class Message implements Runnable
{
    public void run()
    {
        System.out.println("Displaying important message task");
        try
        {
            for(int i=0; i<3; i++)
             {
                 System.out.println("Focus is important to master skills");
                 Thread.sleep(2000);
             }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        
        System.out.println("Displaying important message ended");

    }
}
class LaunchMulti5
{
    public static void main(String args[])
    {
        System.out.println("Main Thread");
        Calc c=new Calc();
        Message m=new Message();
        
        Thread t1=new Thread(c);
        Thread t2=new Thread(m);
        
        t1.start();
        t2.start();
    }
}