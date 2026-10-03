/*_______________________[Exception handling ]------------------------------

Exception:-----
An exception is an unexpexted that accours during the excequation of a programs and thisrupits 
the normal flow of the programs;


Exception Handling:------

Exception handling is a mechanism in java that handel run time errors show that the the normal folow of data can be maintain;


HARACHEY of exception handling 
   
   object :---
@    |
@    |
 throwable
  
  Two types:-----

  [1]=errors
  [2]=Exception

  types of Exception
  [1]=ArithmeticException
  [2]=NullPointerException
  [3]=ArrayIndexOutofbundsExample
  [4]=numberformateException

Types of Exception:-------
[1]=cheacked Exception
[2]=uncheacked Exception

#[cheacked Exception]

these are checked by the compiler
Example:------
ioException ,sqlException ,File not found Exception,Class not found Exception;

[uncheacked Exception]------------------------

thses occurs during run time 

[1]=ArithmeticException
  [2]= 
  [3]=ArrayIndexOutofbundsExample
  [4]=numberformateException

  Keywords use in Exception holding
  
  KEYWORD                            PURPROSE
  [1]= try                      It cantain Risky code 
  [2]=catch                     handels Exceptions
  [3]=finally                  Excequtes wheather an Exception is occurs or not
  [4]=throw                   Expilcitly throws and Exception 
  [5]=throws                       Declayer Exception in a method Signature
  [6]=priblock                      
  
*/
class Exceptionhandling
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

