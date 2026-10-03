import java .util.Scanner;
 class InputScanner
{
public static void main(String args[])
{    

    System.out.print("Enter all Details ");
    Scanner Scan=new Scanner(System.in);
    int a=Scan.nextInt();
    System.out.println("Enter first number "+a);
    int b=Scan.nextInt();
    System.out.println("Enter sec  number "+b);
    String name ;
    name =Scan.nextLine();
    System.out.println("Enter name of person "+name);
    double c;
    c=Scan.nextDouble();
    System.out.println("Double value is "+c);
}
}