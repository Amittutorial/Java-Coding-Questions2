interface AAa
{
    void show();                      //2date

}
interface BB
{
    void output();
}
class printable  implements AAa,BB
{
    public void show()
    {
        System.out.println("Hello show");
    }
        public void output()
    {
        System.out.println("Hello output");
    }
    public static void main(String args[])
    {
        printable  m=new printable();
        
        m.show();
        m.output();
    }
}