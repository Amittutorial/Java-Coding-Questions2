// class A6
// {
//     protected void show()
//     {

//     }
// }
// class B6 extends A6
// {
//     public static void main(String args[])
//     {
        
//     }
// }


abstract class A6
{
    public abstract void show();
}
class B6 extends A6{
    public void show()
    {

    }
}



// # interface 

// An interface in java is a blue print of a class that contains method Declration and constants 

// WHY WE NEED INTERFACES?

// [1]= to achieve abstraction
// [2]=Support multiple inheratiance
// [3]=define a common contract
// [4]=promote loop coupling
// [5]= improve code 


// RULES OF INTERFACE
// [1]=An interface  cann't be instanceciated
// [2]=A class usses the impliment keywords 
// [3]=A class implimenting an interface must implement on abstract method
// [4]= interface method or implicative define
// *method sin innterface are ublic and abstract by default
//* since java Eight Feature we can write nun abstract method in interfaces

/*
Syntax :---

interface InterfaceName
{


}

* interfaces are use to achiev multiple inheridance
[interface]            [interface]               [interface]
    |                       |                         |
    |extends                |extends                  |  implement                                                  
    |                       |                         |      
   [interface]           [abstract class]            [class]
*                           |extends
*                           |
*                           [class]*/        