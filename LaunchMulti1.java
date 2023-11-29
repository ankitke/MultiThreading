import java.util.Scanner;
class LaunchMulti1
{
    public static void main(String args[])
    {
        System.out.println("Calculating task Started");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first number");
        int num1=sc.nextInt();
        
        System.out.println("please enter second number");
        int num2=sc.nextInt();
        
        int res=num1+num2;
        System.out.println(res);
        System.out.println("Calculating task ended");
        
        System.out.println("*******************************");
        
        System.out.println("printing * task started");
        for(int i=0; i<=4; i++)
        {
            System.out.println("*");
        }
        System.out.println("printing * task ended");
        
        System.out.println("******************************");
        
        System.out.println("Displaying important message task");
        for(int i=0; i<3; i++)
        {
            System.out.println("Focus is important to master skills");
        }
        System.out.println("Displaying important message task ended");
        
    }
}