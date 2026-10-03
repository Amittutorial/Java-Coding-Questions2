class StackExample1 {
    int stack[];
    int top;
    int size;

    StackExample1(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        System.out.println("Element value is "+ value);          // note book
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Element remove successfully " + stack[top]);
        top--;
    }

    void display() {
        if (top == -1) {
            System.out.println("Element is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Element is empty");
            return;
        }System.out.println("Top Element is "+stack[top]);
    }
     
    boolean Empty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    boolean Full()
    {
        if(top==size-1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String args[]) {
        StackExample1 a = new StackExample1(5);
        a.push(100);
        a.push(500);
        a.push(600);
        a.push(700);
        a.push(800);
          a.push(900);
            a.push(1000);
        a.display();
        a.pop();
        a.display();
        a.peek();
        a.display();
        System.out.println(a.Empty());
        System.out.println(a.Full());
    }
}