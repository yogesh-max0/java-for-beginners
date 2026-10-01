/*
1. public
public means you can access it from another class.
*/


package access_modifiers;

class student3{

    public String name = "yogi";          // public
    public String dob = "12-29-2003";     // public

    public void display(){
        System.out.println(name);
        System.out.println(dob);
    }
}

public class public1{
    public static void main(String[] args) {

        student3 s = new student3();
        
        System.out.println(s.name);
        
        System.out.println(s.dob);
        
        s.display();
    }
}