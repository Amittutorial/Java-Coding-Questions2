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

class Thread6 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread2--"+i);
        }
    }
}
class  ThreadQ

{
    public static void main(String args[])
    {
        Thread5 t3 = new Thread5();
        t3.start();
        Thread6 t2=new Thread6();
        t2.start();
    }
}
