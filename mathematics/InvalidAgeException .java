/*
class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }

}
class coustomException
{
  static void canVote(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age is less than 18");
        }
        System.out.println("Can vote");
    }
    public static void main(String args[])
    {
        try{
            canVote(17);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}


//__________________warpper classes_________________________________________________________
Wapper class is a pre Define class in java that wraps prinitive data type in user
So that it can be used wher object ae requred

Many Features only work only with workd such as colllecti0n ,Spring boots,hible net

java Stream


primitive datatype       | object
int                         integers
byte                           Byte
short                         short
long                                long
float                            Float
double                             Double
char                              character
boolean                            Boolean

boixing:--------------[Primitive DATATTYPE]

boxing mins 
It means converting a primitive value to wrapper class
class InvalidAgeException 
{
public static void main(String args[])
{
    int a=10; //primitive value
    Integer i=Integer.valueOf( a);// wrapper class
    System.out.println(i);
}
}


Autoboxing :--------------------


class InvalidAgeException 
{
public static void main(String args[])
{
    int a=100;//primitive value
    Integer i=Integer.valueOf( a);// wrapper class //                 
    System.out.println(i);
}
}

UnBoxing:------------
Converting a Wapper object into primitive value manualy

AutoUnboxing:----------------

Automatic conversion of Wapper object into primitive value



class InvalidAgeException 
{
public static void main(String args[])
{
    Integer a=Integer. valueOf(200);
    int i=a.intValue();//                 
    System.out.println(i);
}
}


class InvalidAgeException 
{
public static void main(String args[])
{
    Integer a=107;
    Integer b=102;

    System.out.println(a.compareTo(b));
}
}
*/

