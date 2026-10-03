interface A6
{
    void show();

}
interface B6
{
    void show();
}
class Multiinheridance implements A6,B6
{
    public void show()
    {
        System.out.println("Hello show");
    }
    public static void main(String args[])
    {
        Multiinheridance m=new Multiinheridance();
        
        m.show();
    }
}