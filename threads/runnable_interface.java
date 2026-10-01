/*
Runnable = what the thread should do
Thread = the object that actually executes it
start() = starts the new thread
run() = contains the work
*/

// We use the Runnable interface because it lets us separate the work (task) from the thread that executes the work.    
// This is useful when we want to perform the same task with multiple threads.    


class threads implements Runnable{

    String task;

    threads(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task);
    }
}

public class runnable_interface{
    public static void main(String[] args) {
   
        threads t1 = new threads("cooking");
        threads t2 = new threads("dancing");
        threads t3 = new threads("studying");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();
        
    }
}