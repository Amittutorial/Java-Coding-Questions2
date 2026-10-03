/*class Mythraed extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread is running "+i);  // extends Thread
        }
    }
    public static void main(String args[]){
        Mythraed t1=new Mythraed();              
        t1.start();                          Using start for output
    }
}*/

// implement of runnable example

class Mythraed implements Runnable  
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread is running "+i);  // By implement runable 
        }
    }
    public static void main(String args[]){
        Mythraed t1=new Mythraed();
        Thread t=new Thread(t1);                  // implement  Thread object refrence pass
        t.start();
    }
}

