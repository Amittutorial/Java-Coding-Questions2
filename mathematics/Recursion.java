    //______________________________[Recursion]_____________________________________________
//     // when any funcation call itself again and again
// base funcation jis par aakar funcation ruk jae
    class Recursion
    {
        int Factorial(int num)  // Factorial of number
        {
            
            if(num==1)
            {
                return 1;
            }
            return num*Factorial(num-1);
        }
        int  sum(int num)     // sum of number
        {   int i,Sum=0;
            for(i=1;i<=num;i++)
            {
                Sum= Sum+i;
            }
            return Sum;


            
        }
        public void main(String args[])
        {
            Recursion fun=new Recursion();
            System.out.println(fun.Factorial(5));
            System.out.println(fun.sum(50));
        } 
    }
