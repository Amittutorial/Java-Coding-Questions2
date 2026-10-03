import java.lang.Thread;
class Thread5 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1--- "+i);
        }
    }
}

class Thread5 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread2--"+i);
        }
    }
}
class my ThreadQ

{
    public static void main(String args[])
    {
        Thread1 t3 = new Thread1();
        t3.start();
        Thread2 t2=new Thread2();
        t2.start();
    }
}
