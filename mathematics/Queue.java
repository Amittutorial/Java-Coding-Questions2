class Queue {
    int que[] ;
    int size;
    int rear;
    int front;

    Queue(int size) {
        this.size = size;
        que = new int[size];
        rear = -1;
        front = 0;
    }

    void Insert(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        que[++rear] = value;
        System.out.println("Element value is " + value);
    }
    void push() {
        if (rear == size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        System.out.println("Element value is ");          // note book
    }
    void Remove()
    {
        if(front >rear)
        {
            System.out.println("Element is Under flow");
            return ;
        }
        System.out.println("Element is removed "+que[front]);
        front++;
    }
    void display()
    {
        if(front >rear)
        {
            System.out.println("Element is empty");
            return;
        }
        for(int i = front;i<=rear;i++)
        {
            System.out.println("Element is "+que[i]);
        }
    }
    void peek()
    {
        if(front >rear)
        {
            System.out.println("Element is Empty");
            return;
        }
        System.out.println("Peak Element is "+que[front]);
    }

        boolean Empty()
    {
        if(front >rear)
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
        if(front>rear)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    void TotalEle()
    {  
        if(front >rear)
        {
            System.out.println("Element is empty");
        }
        for(int i=front ;i<=rear;i++)
        {
            
        }
        System.out.println("Total Element is " + (rear-front));
    }
     

    public static void main(String args[]) {
        Queue n = new Queue(3);
        n.Insert(100);
        n.Insert(200);
        n.Insert(300);
        n.display();
        n.TotalEle();
         n.peek();
        n.push();
        n.display();
       n.Remove();
       n.display();
       n.Remove();
       n.display();
       n.peek();
       n.display();
      System.out.println( n.Empty());
      n.display();
      System.out.println( n.Full());
      n.TotalEle();


    

    }
}