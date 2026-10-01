/*
Inheritance means one class gets the properties and methods of another class.
In Java, Inheritance is achieved using the extends keyword.

-- so we can reuse code from one class to another class

there are 4 types of inheritance:
1) single inheritance (one parent class and one child class)

2) multilevel inheritance ( grandparent -> parent -> children )

3) heirarichal inheritance ( one parent -> multiple children )

4) hybrid inheritance ( one child -> multiple parents | Java does NOT allow this with classes,
but we can achieve it using interfaces)
*/

// 1) single inheritance
// one parent class and one child class
// syntax : class child extends parent{}

package oops.inheritance;

class animals{
    String name = "lion";

    void eat(){
        System.out.println(name + " is eating ");
    }
}

class lion extends animals{
    void roar(){
        System.out.println(name + " roars after eating");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        
        lion l = new lion();
        l.eat();
        l.roar();
    }
}
