class thread extends Thread{
    String task;

    thread(String task){
        this.task = task;
    }

    public void run(){
        for (int i  = 1; i<=5; i++){
            System.out.println(task + ":" + i);
        }
    }
}

public class multi_thread{
    public static void main(String[] args) {
        thread t1 = new thread("cooking");
        thread t2 = new thread("cleaning");
        thread t3 = new thread("studying");

        t1.start();
        t2.start();
        t3.start();
    }
}