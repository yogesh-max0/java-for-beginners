package oops.abstraction;

abstract class animal{     // abstract class

    abstract void sound(); // abstract method
    
    void place(){          // normal method
    System.out.println("");
    }
}

class lion extends animal{

    void place(){
        System.out.println("lion in zoo:");
    }
    void sound(){
        System.out.println("lion roars after eating");
    }

    void category(){
        System.out.println("lion is a carnivore");
    }
}

class deer extends animal{

    void place(){
        System.out.println("deer in zoo:");
    }

    void sound(){
        System.out.println("deer doesnt makes sound after eating");
    }

    void category(){
        System.out.println("deer is a herbivore");
    }
}

public class abstraction2{
    public static void main(String[] args) {
        lion lion = new lion();
        deer deer = new deer();

        lion.place();
        lion.category();
        lion.sound();

        deer.place();
        deer.category();
        deer.sound();
    }
}