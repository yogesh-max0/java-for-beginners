/*
Encapsulation means wrapping data (variables) and the methods that operate on 
that data inside a class, while restricting direct access to the data.

--The most common way to achieve it is:
1) Make variables private
2) Use public getter and setter methods to access/change them
*/

package oops.encapsulation;

class student {
    //private variable
    private String name;
    private int age;

    public void details(String name , int age){
        this.name = name;
        this.age = age;
    }
    
    // make it public 
    public void display(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}

public class encapsulation{
    public static void main(String[] args) {
        student s = new student();
        s.details("yogesh",22);
        s.details("yogi",23);
        s.display();
    }
}