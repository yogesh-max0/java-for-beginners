/*
Abstraction means hiding the implementation details and showing 
only the essential information.
*/

package oops.abstraction;

// abstract class
abstract class vehicle{    // abstract class must have abstract method

    // abstract method
    abstract void start();  // class must be abstract class to make abstract method
    
    abstract void stop();
    // abstract method donot have body
}

class car extends vehicle{

    void start(){
        System.out.println("car started");
    }
    void stop(){
        System.out.println("car stopped");
    }
}

class bike extends vehicle{

    void start(){
        System.out.println("bike started");
    }
    void stop(){
        System.out.println("bike stopped");
    }
}

public class abstraction{
    public static void main(String[] args) {
        
        car c = new car();
        bike b = new bike();

        c.start();
        c.stop();

        b.start();
        b.stop();
        
    }
}