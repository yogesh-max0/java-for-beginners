/*
2. Runtime Polymorphism — Method Overriding
Here, a parent reference refers to a child object, and the child's overridden method is executed.
*/

package oops.polymorphism;

class animal{
    void sound(){
        System.out.println("animals sounds");
    }
}

class dog extends animal{
    
    @Override
    void sound(){
        System.out.println("dog barks ");
    }
}

class lion extends animal{
    
    @Override
    void sound(){
        System.out.println("lion roars");
    }
}

class cat extends lion{
    
    @Override
    void sound(){
        System.out.println("cat also roars like lion but it's funny");
    }
}

public class runtime_polymorphism{
    public static void main(String[] args) {
        
        animal l = new lion();
        animal d = new dog();
        animal c = new cat();
        
        l.sound();
        d.sound();
        c.sound();
    }
}