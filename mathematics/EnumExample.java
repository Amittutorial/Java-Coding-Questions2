enum Days
{
    Monday,
    Tuesday,
    wednesday,
    Thrusday,
    Friday,
    Saturday
    

}
class EnumExample
{
    public static void main(String args[])
    {
        System.out.println("All days");
       for(Days days:Days.values())
       {
       System.out.println(days+ " ") ;
       }
    }
}