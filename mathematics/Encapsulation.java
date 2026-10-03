   /*________________________________________________[Encapsulation]______________________________
Wrapping of data members [variables and member funcation into single unit class]
*/

class Encapsulation
{
    private int roll;
    private String name;

    public void setRoll(int roll)
    {
      this.roll=roll;
    }
    public int getRoll()
    {
        return roll;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
          return name;
       }
       public static void main(String args[])
       {
        Encapsulation e=new Encapsulation();
        e.setRoll(12);
        e.SetName("Amarnath");
        System.out.println(e.getRoll());
        System.out.println(e.getName());


       }
}