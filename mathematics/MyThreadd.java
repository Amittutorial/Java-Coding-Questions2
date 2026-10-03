import java.lang.Thread;
class MyThreadd extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String args[])
    {
       MyThreadd t=new MyThreadd();
       t.start(); 
       // t.start();  this will not work here as thread run only once
    }
}