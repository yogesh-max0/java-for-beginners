/*
Synchronized keyword is used to prevent the race condition in multithreading.
Race condition is a situation where two or more threads try to access the same resource at the same time.
*/

class counter{
    int count = 0;
    synchronized void increment(){
        count++;
        System.out.println(count);
    }
}

public class synchronized_keyword{
    public static void main(String[] args) {
        counter c = new counter();
        Thread t1 = new Thread(()->{
            c.increment();
        });

        Thread t2 = new Thread(()->{
            c.increment();
        });

        t1.start();
        t2.start();

    }
}