import java.lang.Thread;
class Thread99 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
           
           try{
                Thread.sleep(2000);
                System.out.println("hii");
            }
                catch(InterruptedException e){

                }
        }   
    }
}
    class Thread12 extends Thread99 {
        public void run()
        {     
            for(int i=1;i<=5;i++)
            {  
                
                try
                {
                    Thread.sleep(2000);
                    System.out.println("Hello");
                }
                catch(InterruptedException e)
                {

                }
            }
        }
    }
        class Threadone
        {
            public static void main(String args[])
            {
               Thread99 t1=new Thread99();
               t1.start();
               Thread12  t2=new Thread12();
               t2.start();

            }
        }
    
    
