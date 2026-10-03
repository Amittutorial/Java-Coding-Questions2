/*__________________________________________________[OOPs]__________________________________________________
Objects Orianted Programing System

Main four piller of OOPs
[1]=Inheritance  (Like Parents child relation in two different class ,class under class)

[2]=Polymorphism  (different phase)

[3]=Abstraction  (hiding the Emplementation part and Showing Funcatlity);

[4]=Encapsulation  

___________________________________
Other two parts
[5]=Class
[6]=Object

___________________________________________[CONSTRUCTOR]______________________________________________

CONSTRATOR SPECIAL TYPES OF METHOD HAVING SAME NAME AND CLASS NAME AND DO NOT HAVE EXPLIECIT RETURN TYPE

Ex--------
class ClassName
{
class Name ()  ------constructor
{

// code
} 
}

___________________________________________[Types of constractor]

[1]=parametrise cons
[2]=Non--parametrised Constractor


EX-------

class OOPs
{
Students()                  // non parametrised Constractor
code//
}
Student (int a)    // parametrise cons
{
code a//
}


______________________________________________*//* 

class OOPs
{
    OOPs()
    {
      System.out.println("This is default constrator");
    }
    OOPs(int roll)
    {
        System.out.println("Roll number is "+roll);
    }
    OOPs(long num)
    {
        System.out.println("mobile number is "+num);
    }
    public static void main(String args[])
    {
        OOPs m=new OOPs();
        OOPs n= new OOPs(21);
        OOPs s=new OOPs(7619917057L);
}
}

_________________________________________________________________*/

