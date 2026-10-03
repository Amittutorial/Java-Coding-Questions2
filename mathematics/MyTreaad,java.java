class MyTreaad extends Thread
{
    public void run()
{
  for(int i=1;i<=5;i++)
  {
    System.out.println("Hii❤️❤️❤️❤️");
    try{
    Thread.sleep(5000);
    }
    catch(InterruptedException e)
    {

    }
  }
}
}