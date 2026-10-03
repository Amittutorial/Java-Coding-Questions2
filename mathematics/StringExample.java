/*__________________________________________[STRING]____________________________________________
Non primitive data type
Array of Characters
_______________________________________[Typer of String]_____________________________

| No. | Class             | Mutable / Immutable | Thread Safety                        | Performance                     |
| --- | ----------------- | ------------------- | ------------------------------------ | ------------------------------- |
| 1   | **String**        | Immutable           | Thread-safe (immutable होने के कारण)  | Slow for repeated modifications |
| 2   | **StringBuffer**  | Mutable             | Synchronized                         | Relatively slow                 |
| 3   | **StringBuilder** | Mutable             | Non-synchronized                     | Fast                            |

String can be Define________________
___________________________________________________________________________________________
# String in Java

### Definition

A String can be defined as a sequence of characters. In Java, String is a class used to represent and store a sequence of characters.

------------------------------------------------------------------------------------------------------------

## Ways to Create a String

### [1] By String Literal

**Syntax:**

String s = "RAJ";

Example:


String name = "Amit";


------------------------------------------------------------------------------------------

### [2] By Using `new` Keyword

**Syntax:**


String s = new String("RAJ");


Example:


String name = new String("Amit");


--------------------------------------------------------------------------------------------

# Mutable and Immutable String

### Mutable String

A mutable object can be changed after it is created.

Example: StringBuilder, StringBuffer.

### Immutable String

An immutable object cannot be changed after it is created. If we modify it, a new object is created.

Example: String.

### Important Point

**String is Immutable in Java.**

+__________________________________________________________________________________*/ 


class StringExample
{   
    
    public static void main(String args[])
    {  
        String a= "Ashu";
        String b= "Ashu";
        System.out.println(a);
        System.out.println(a.length());            // print number of length
        System.out.println(a.toUpperCase());                 // use to print capital leter
        System.out.println(a.toLowerCase());                               // use to print small later
        System.out.println(a.charAt(2));                          // print index value
        System.out.println(a.concat("tosh"));                                       // us to add both
        System.out.println(a==b);

        
    
    }
}/*

    String a=new String ("Amit");
     String b ="Amit";
      System.out.println(a);
      System.out.println(a.length());            
        System.out.println(a.toUpperCase());                
        System.out.println(a.toLowerCase());                               
        System.out.println(a.charAt(2));                          
        System.out.println(a.concat("Verma"));                                       
        System.out.println(b.equals(a));

}
}
//______________________________________________________________________________________ */
/* 
String s="Amit";
System.out.println(s);

for( int i=0;i<=(s.length()-1);i++)
{
System.out.println(s.charAt(i));

}
    }
}
__________________________________________________________________________________________________  */
/* 
String s="Amit";
int count=0;
for( int i=0;i<=(s.length()-1);i++)
{
    if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='u'||s.charAt(i)=='o')
    {
        count++;
    }
} 
System.out.println(count);
    }
}
____________________________________________________________________________*/
/* 
String s1= new String("Amit");
System.out.println(s1);
System.out.println(s1.concat("Verma"));
System.out.println(s1);
System.out.println("----------------------------------------");

StringBuilder sb=new StringBuilder("Amit");
System.out.println(sb);
System.out.println(sb.append("Verma"));
System.out.println(sb);
System.out.println("-------------------------------------------------------");

StringBuffer ssb= new StringBuffer ("Amit");
System.out.println(ssb);
System.out.println(ssb.append("Verma"));
System.out.println(ssb);
    }
    }

//________________________________________________________________________________*///
//wap string palindrome or not  homework
/*
StringBuilder sb=new StringBuilder("abcdcba");
System.out.println(sb);
System.out.println(sb.reverse());
    }
} */

    //__________________________________________________________________________
/* 
    String s=new String("JAVA");
    System.out.println(s);
    s=s.replace('A','O');
    System.out.println(s);
    }
}
________________________________________________________________ */
/*int count =0;
String s="This is our Java Class";
for(int i=0;i<s.length();i++)
{
if( s.charAt(i)==' ')
    count++;


}System.out.println(count);

    }
}
___________________________________________________________________________________*/














