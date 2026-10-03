// class Funcation
// {
//     void display()

// {
// System.out.println("hello display");
// }
// public static void main(String args[])
// {
//     Funcation f =new Funcation();               //object
//     System.out.println("Program start");
//     f.display();                                 //funcation call
//     System.out.println("Program Ends");
    
// }    
// }

//______________________________________________________________________________

// class Funcation
// {
//     void display()
//     {
// int a=23;
// int b=23;
 
// System .out.println(a+b);
// System.out.println("hello display");
// }
// public static void main(String args[])
// {
//     Funcation sum =new Funcation();               //object
//     System.out.println("Program start");
//     sum.display();                                 //funcation call
//     System.out.println("Program Ends");
//     sum.display();
// }    
// }

//_________________________________________________________________________________

// class Funcation
// {
//     void Myintro()
//     {

 
// System .out.println("*My Name Amit verma \n *My father name is Mr sunil kumar\n *i am B.tec CSE student\n *My village name is loharuli \n * My collage name is RRGIT");
// System.out.println("THANKS FOR INTRODUCATION");
// }
// public static void main(String args[])
// {
//     Funcation N =new Funcation();               //object
//     System.out.println("Program Start");
//     N.Myintro();                                 //funcation call
//     System.out.println("Program Ends");
    
// }    
// }

//___________________________________________________________________________

//  class Funcation
// {
//     void star()
//     {
// int i; int j;
// for (i=1;i<=5;i++)
// {
//     for(j=1;j<=5;j++)
//     {
//         if(i==3&&j>=3||j==3)
//         System.out.print("*");
//     }
//     System.out.println(" ");
// }
// }
// public static void main(String args[])
// {
//     Funcation sum =new Funcation();               //object
//     System.out.println("Program start");
//     sum.star();                                 //funcation call
//     System.out.println("Program Ends");
//     sum.star();
// }    
// }

//_______________________________________________________________

// class Funcation
// {
//     void myName(String name)
//     {
//         System.out.println("my name is "+name);
//     }
//     void myRoll(int rn)
//     {
//         System.out.println("My roll number is "+rn);
//     }
//     public static void main(String args[])
//     {
//         Funcation mi =new Funcation();
    
//         mi.myRoll(  912345656); 
//         mi.myName(" Amit verma");
//     }
// }

//_________________________________________________________________
// class Funcation
// {
//     void myIntro(int rn,String name) //parameterised method
//     {
//         System.out.print("m name is " +name);
//         System.out.println("My roll number is " +rn);
//     }
//     public static void main(String args [])
//         {
//             Funcation mi= new Funcation();
//             mi.myIntro(12345,"Amit verma\n");
//         }
// }

//__________________________________________________________________________________

// class Funcation
// {
//     void show() 
//     {
        
//         System.out.println(" this is show method");
//     }
//      static void output()
//     {
        
//         System.out.println(" this is output method");
//     }
//     public static void main(String args [])
//         {
//             Funcation mi= new Funcation();
//            output ();
//            mi.show();
//         }

// }

//___________________________________________________________________________

// class Funcation
// {
//     int a=100;
//     static int c=233; // static variables
//     public static void main(String args [])
//     {
        
//         Funcation m=new Funcation();
//         int b=200;
//         System.out.println(m.a);
//         System.out.println(b);
//         System.out.println(c);  // no class instance is needed
//     }
// }

//____________________________________________________________________________

// class Funcation
// {
//     void tocheackEvenoddnumber(int num)
//     {
// if(num%2==0)
//     System.out.println("Even");
//     else System.out.println("Odd");

//     }
//     public static void main(String args [])
//     {
        
//         Funcation i=new Funcation();
//         i.tocheackEvenoddnumber(119);
//         i.tocheackEvenoddnumber(110);
//     }
// }

//____________________________________________________________________________________

// class Funcation{
//     int result;
//     void Cheackbignumber(int a,int b)
    
//     {
//         int result =(a>b)?a:b; // ternary operator using cheack large number
//         System.out.println(result);
//     }
//     public static void main(String args[])
//     {
//      Funcation l =new Funcation();
//      l.Cheackbignumber( 10,15);//Funcatinn call
     
//     }
// }
//______________________________________________________________________

// class Funcation{
//     int result;
//      void Cheackbignumber(int a,int b,int c)  // ternary operator
    
//     {
//         int result =(a>b)?(a>c)?a:c:(b>c)?b:c; // ternary operator using cheack large number
//         System.out.println(result);
//     }
//     public static void main(String args[])
//     {
//      Funcation l =new Funcation();
//      l.Cheackbignumber( 10,15,11);//Funcatinn call
     
//     }
// }

//_________________________________________________________

// class Funcation{
    
//      void Ableforvote(int age)  // ternary operator
//     {
//     if(age>=18)
//     {
//         System.out.println( "Eligible for vote");

//     }
//     else{
//         System.out.println("Not Eligible for vote");
//     }
        
//     }
//     public static void main(String args[])
//     {
//      Funcation l =new Funcation();
//      l.Ableforvote(18);//Funcatinn call
     
//     }
// }

//_____________________________________________________________________

class Funcation{
    
     boolean Ableforvote(int age)  // ternary operator
    {
        return(age>=18)? true:false;
    }
    String evenorodd(int num)
    {
       return(num%2==0)?"EVEN" : "ODD";
    }
    public static void main(String args[])
    {
     Funcation l =new Funcation();
     System.out.println(l.Ableforvote(18));//Funcatinn call
     System.out.println(l.Ableforvote(12));
     System.out.println(l.evenorodd(12));
     
    }
}
//_______________________________________________________________________________------



