/*
When one class inherits another class:
example : class Dog extends Animal

Dog is the child class, and Animal is the parent class.

super is used inside Dog when you want to access something from Animal (the parent).
super = parent class

With super, you can call the parent's constructor or method from the child class 
without creating a separate parent object in main().
*/

package keywords;

class animal2{
    void sound(){
        System.out.println("animal sounds");
    }
}

class dogs extends animal2{
    void sound(){
        System.out.println("dog barks");

        super.sound(); // using super keyword to inherit parent class
    }
}

public class super_keyword {
    public static void main(String[] args) {
        dogs d = new dogs(); // here we didnt create animal class object
        d.sound();         // but we called its method using super keyword 
    }
}
