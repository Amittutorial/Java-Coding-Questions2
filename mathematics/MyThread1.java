class Thread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1--" + i);
        }
    }
}

class Thread2 implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread2" + i);
        }
    }
}

class MyThread1 {
    public static void main(String[] args) {
        Thread1 tt1 = new Thread1();
        java.lang.Thread t = new java.lang.Thread(tt1);
        t.start();

        Thread2 t2 = new Thread2();
        java.lang .Thread t44=new java.lang.Thread(t2);
        t44.start();
    }
} 
