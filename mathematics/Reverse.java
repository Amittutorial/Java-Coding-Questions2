class Reverse
{
    public static void main(String args[])
    {
       /* int a[]={11,12,13,14,15};
        int reverse[]=new int [a.length];
        System.out.println("Reverse Array is: ");
        for(int i=0;i<a.length;i++)
        {
            reverse[i]=a[a.length-1-i];
        }
        for(int i=0;i<a.length;i++)
        {
            
            System.out.println(reverse[i] +"  ");
        }
    }
}
*/


    int a=10;
    int b=20;
    int c=a+b;
    a=c-a;
    b=c-b;
    System.out.println("After Swaping a is "+a);
    System.out.println("After Swaping b is "+b);
    }
}