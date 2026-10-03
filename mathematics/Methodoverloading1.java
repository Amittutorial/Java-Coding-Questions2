/*Polymorphims

[1]=Method Overloading
* Static polymorphims
[2]=Method overiding


_______________________________________[Method overloading]________________
method overloading is java feature in which a class consist of multiple method with same name and different parameter


RULES OF METHOD OVERLOADING

1}- method name should mbe same
2}-- parameter should be different

___________________________________________________________________________*/ /* 
 class Methodoverloading1 {
    
void add(int a,int b)
{      

    System.out.println(a+b);
}

void add(int a,int b , int c)
{
    System.out.println(a+b+c);
}
public static void main(String args[])
{
    Methodoverloading1 sum=new Methodoverloading1();
    sum.add(12,12);
    sum.add(12,12,12);

}
}


_____________________________[Method overriding]___________________________
It is feature in java where a child clas provides its outimplimentation of method Deaft is already Defind


class A
{
    void show()                                             //overidien
    {

    }
} class B extends A
{
    void show(int a)                             // override
    {

    }
public static void main(String args [])
{

}
}

/*ROLES OF METHOD OVERRIDING

1-- method name must be same
2-- prarmeter must be same
3----writen type must be same and cobarianrt
4--Acces modifier can not be more restricitad
5---final method can not be overriden
6--static method can not be overriden
(this is called method hiring not overriding)(_______________________)
7--private method can not be overriden
_____________________________________________________*/

class A
{
    void Fun()
    {
        System.out.println("hello Buddy");
    }
}  class B  extends A
{
    void Fun(int a,String m) 
    {
       System.out.println(a+" | "+m);
    }
} class Methodoverloading1  extends B
{
    void Fun(double c)
    {
    System.out.println(c);
    }
    public static void main(String args[])
    {
        Methodoverloading1 g=new Methodoverloading1();
        g.Fun();
        g.Fun(21);
        g.Fun(3456,"Amit");
    }
}



