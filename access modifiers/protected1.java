/*
3.protected is basically an access modifier that says:
This member can be accessed by classes in the same package, and by child classes.
*/


package access_modifiers;

class student2 {
    
    protected String name = "yogi";   // protected

    protected void display(){
        System.out.println(name);
    }
}

class college extends student2{

    void show(){
        System.out.println(name);
        display();
    }
}

public class protected1{
    public static void main(String[] args) {
        college student = new college();

        student.show();
    }
}