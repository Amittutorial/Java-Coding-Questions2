import java.lang.Thread;
class Thread111 extends Thread
{
    Thread111(String threadname)
    {
        super(threadname);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getPriority());
    }
}
class MyThreadee
{
    public static void main(String args[])
    {
        Thread111 t1=new Thread111("Amit");
        Thread111 t2=new Thread111("Raj");
        Thread111 t3=new Thread111("Abhiranjan");
       t1.setPriority(4);
       t2.setPriority(1);
      t3.setPriority(2);

        t1.start();
        t2.start();
                t3.start();
    }
}