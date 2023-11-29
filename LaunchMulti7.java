class Demo1 implements Runnable
{
    public void Run()
    {
        System.out.println("Child Thread Executing");
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("Some Problem");
        }
        System.out.println("Child thread task completed");
    }
}

class LaunchMulti7
{
    public static void main(string args[])
    {
        System.out.println("Main Threas Started");
        Demo1 d=new Demo1();
        Thread t1=new Thread(d);
        t1.start();
    }
}