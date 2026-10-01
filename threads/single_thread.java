class thread1 extends Thread{
    public void run(){
        System.out.println("this is single thread");
    }
}

public class single_thread{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.run();    // just calls run() like a normal method
        t1.start();  // starts a new thread
        // always use start() to execute the thread
    }
}

