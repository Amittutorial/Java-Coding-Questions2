import java.lang.Thread;
class MyThreaddd extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" | "+Thread.currentThread().getName());
        }
    }
    public static void main(String args[])
    {
        MyThreaddd mt1=new MyThreaddd();
        mt1.start();
        MyThreaddd mt2=new MyThreaddd();
        mt2.start();
    }
}