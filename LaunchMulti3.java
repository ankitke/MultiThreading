class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child thread");
    }
}

class LaunchMulti3
{
    public static void main(String args[])
    {
        System.out.println("Main thread");
        MyThread t=new MyThread();
        t.start();
        
        
    }
}