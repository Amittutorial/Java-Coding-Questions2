import java.lang.Thread;
class Thread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1-" + i);
        }
    }
}

class Thread2 implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread2-" + i);                       // java.lang package use 
        }
    }
}

class MyThread {
    public static void main(String[] args) {
        Thread1 tt1 = new Thread1();
       Thread t=new  Thread(tt1);
        t.start();

        Thread2 t2 = new Thread2();
        Thread t44=new Thread(t2);
        t44.start();
    }
} 
