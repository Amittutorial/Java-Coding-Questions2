class StackExample
{
    int stack[];
    int top;
    int size;
    StackExample (int size)
    {
        this.size =size;
        stack=new int[size];
        top=-1;

    }

    void push(int element)
    {
        if(top==size-1)
        {
            System.out.println("Stscl over flow");
            return;
        }
        stack[++top]=element;
        System.out.println("Element Adding Sucessfully "+element);
    }
 public static void main(String args[])
 {
    StackExample a=new StackExample(5);
    a.push(100);
    a.push(500);
    a.push(600);
    a.push(700);
    a.push(800);
 }

}