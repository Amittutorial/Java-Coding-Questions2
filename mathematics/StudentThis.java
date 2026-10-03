/*_________________________________[This keyword]_____________________________________

This keyword is a Refrence that refferce to the current object of a call

______________________________________[Usses of this keybord]____________________________________

[1]= refrence current instance variable 
[2]= call current call method
[3]=constractor chaining
[4]= pass current object to method
[6]=pass current object to constractor
[7]= return current object

____________________________________________________________
*/
/* class StudentThis
{
    void output()
    {
       this.show(10,"Amit");
    }
    void show(int a,String name)
    {
         this.show();
       System.out.println(name + " | " +a);  
    }
    void show()
    {
      System.out.println("Show Method");
    }
    public static void main(String args[]){
        StudentThis s=new StudentThis();
        s.output();
    }
}
 */




/*___________________________________________________________[Constractor chaining]______________________________________
It is a process in which one constractor calls the other constractor

**RULES ####
[1]=this() must be mention as the first Statement
[2]= there must at lest one constractor which does not have this keyword
*/

/*
 
/*___________________________________________________________[copy constractor]___________
 A copy constractor is constractor that initialige a new object using another objet of the same call*/
 

/*_______________________________________________[Inharidance]__________________________________________
 When one class in harit another call is known as inharidance
  
 Types of inharidance
 [1]= Single level inharidance
 [2]=Multi level
 [3]=hiearichal 
 [4]=Multiple
 [5]= hybrid

Types of [4]and [5] java is not support ;
__________________________________________-[Single level haridance]______________________________________

class A______________extends_____________________Class B
                            

class A
{

}
class b
{

}
_____________________________________________[Multi level haridance]________________________
            extends
class A-----------------------classB---------------classC

class A
{

}
class B extend A
{

}
class C extend B
{

}                      

_______________________________[Hierarchical inharidance] ______________________________

Syntax:--

class A                                                                [class A]
{                                                                      /      \
}                                                                   classB     class C
class B extend A
{

}
class C   extend A
{

}   

______________________________________[Multiple Inharidance]__________________________________
Syntax:--
*                                  [class A]            [class B]
#
#                                      \                   /
#                                         [class C]   /

java Does not support multiple inharidance Due to ambiguti situation
* Because pointer are not support in java  

_______________________________________________[Hybrid inharidance]_________________________
 Hybrid inharidance Due to ambiguti situation
 #                     [class A]
 #                     /       \
 #                   /          \
 #               class B       [class C]
#                    \            /
#                     \          /
#                       [class D]
 * But we can achiev multiple inharidance with the help of interfaces
   



   
/*___________________________________________________
class Teacher
{
  void show()
  {
    System.out.println("Show method  From teacher");    //  [1 Exapmple]
  }
  void Display(int a)
  {
    System.out.println(a);
  }
}
class StudentThis extends Teacher                           // Write in Note book
{
  void Output ()
  {
   System.out.println("output from Student");
  }
public static void main(String args[]){
    StudentThis c=new StudentThis();
    c.show();
    c.Output();
    c.Display(12);

}
}

______________________________________________________________*/

