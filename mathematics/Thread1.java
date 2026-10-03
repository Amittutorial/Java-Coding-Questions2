class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1--- "+i);
        }
    }
}
class Thread2 extens Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread2--"+i);
        }
    }
}
class Thread

{
    public Thread(Thread2 t2) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String args[])
    {
        Thread1 t1 =new Thread1();
        t1.start();

        Thread2 t2=new Thread2();
        t2.start();
    }

    public static void sleep(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }
}