  // method parameter==Funcation having same method signature and different parameters
//   {Funcation with same name with different parameter}


// Example
// double show(int a)
// {
//     return a;   
// }
// int show(int a)
// {
//     return a;
// }
// in given example same method name and same parameter so hai



//________________________________________________________________________________________
  class Methodoverloading
 {
    int greaternumber(int a,int b)
    {
        return(a>b)?a:b;
    }
    int Graternum(int a,int b,int c)                          // Greater than three number
    {
        return(a>b)?((a>c)?a:c):((b>c)?b:c);
    }
      void sum(int a,int b)                   // print sum_______________________________
     {
        int sum;
         sum =a+b;
        System.out.println(sum);
        
     }
     
     void Sum(int a,int b,int c)                  //print sum of three number__________________________________
     {
        
        int sum=a+b+c;
        System.out.println(sum);
     }
     double Show(int a)                          // print value of a______________________________
     {
        return a;
     }
     int show(int a)
     {
        return a;
     }
     void Fact(int num)       // Factorial of any number________________________________________
     { int i, fact=1;
        for(i=1;i<=num;i++)
        {
        fact=fact*i;}
              System.out.println(fact);
         
        }
        void add(int num)    //_______________________________________Sum of natural number
        {  int i,s=0;
            for(i=1;i<=num;i++)
            {
                s=s+i;

            }
            System.out.println(s);
        }
        void odd(int num)           // sum of odd number_________________________________
        {    int i,sum=0;
            for(i=1;i<=num;i++)
            {
                if(i%2!=0)
                {
                  sum=sum+i;  
                }
                
            }System.out.println(sum);
        }
        void profit(int sp,int cp )    // profit  or loss
        {
            if(cp>sp)
            {
                System.out.println("loss");

            }
            else{
               System.out.println("profit") ;
            }

        }
        void Tringle(int a,int b,int c)           // Given tringle is isoscale,equilateral,scalene 
        {
            if(a==b&&b==c)                 // for equilateral
            {
                System.out.println("equilateral");
            }
            else{
                if(a==b||b==c||c==a)            //for isoscales
                {
                    System.out.println("isoscales");
                }
                else{
                    System.out.println("scalene");
                }
            }
        }
        void Sumdigit(int num)                    // sum of digit 
        {int sum=0,digit;
            while(num!=0)
            {
                digit=num%10;
                num=num/10;
                sum=sum+digit;
            }
            System.out.println(sum);



        }
        void Reverse(int num)                  //______________________  // Reverse of number 
        {int sum=0,digit;
            while(num!=0)
            {
                digit=num%10;
                num=num/10;
                sum=sum*10+digit;
            }
            System.out.println(sum);



        }
        void palindrome(int num) // number is palindrome  
        {  
            int sum=0,digit,p = num;                  
              
            while(num!=0)
            {
                digit=num%10;
                num=num/10;
                sum=sum*10+digit;
            }
            
            if(sum==p)
            {
                System.out.println("number is palindrome");
            }
            else{
                System.out.println("number is not palindrome");
            }




        }
     
    public static void main(String args[])
    {
        Methodoverloading fun=new Methodoverloading();
        System.out.println(fun.greaternumber(12,14));
        System.out.println(fun.Graternum(12,35,100));
        fun.sum(10,3);
        fun.Sum(12,13,14);
        System.out.println(fun.show(12));
        System.out.println(fun.Show(12));
        fun.Fact(5);
        fun.add(20);
         fun.odd(35);
         fun.profit(111,45);
         fun.Tringle(12,32,45);
         fun.Sumdigit(123);
         fun.Reverse(123);
         fun.palindrome(121);

    }
} 

//________________________________________________________________________---
 

