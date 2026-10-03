/*class ExceptionExample
{
public static void main(String args[])
{
int a=10;
int b=0;
int r;
System.out.println("Start programs..............");
 
try
{
r=a/b;
System.out.println("Result is " +r);
}
catch(ArithmeticException e)
{
System.out.println("Exception Handle");
}
System.out.println("Programs Ends ........");
}
}
*/
 
//____________________________________[multiple catch hadling]---------------------------------------------------
/*
class ExceptionExample
{
    public void main (String args[])
    {
        System.out.println("Programs Ends......");
        try{
            int a[]={10,20,30};
            int c=20;
            int d=0;
            
        
            System.out.println(a[2]);
            System.out.println(c/d);

        } 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Handel");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Handel");
        }

        
        System.out.println("Programs Ends.......");
    }
}

_______________________________________________________________________
class ExceptionExample
{
    public static void main(String args[])
    {
        System.out.println("Programs start...............");

        try{
            int a[]={10,20,30};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception Handels");
        }
        finally{      // Use fimally 
            System.out.println("This is finally Block...........");

        }
        System.out.println("Program Ends............");
    }
}
    */

class ExceptionExample
{
    public static void main(String args[])
    {
        System.out.println("Programs start...............");

        try{
            int a[]={10,20,30};
            System.out.println(a[5]);
        }
        
        finally{      // Use fimally 
            System.out.println("This is finally Block...........");

        }
        System.out.println("Program Ends............");
    }
}

