/*
2.private
private means it can only be accessed inside the same class.
*/

package access_modifiers;

class student1{
    private String name = "yogesh";   // private
    public String names = "yogi";     // public

    private void display_private(){
        System.out.println(name);
    } 
    public void show(){
        display_private();           // allow this only cause same class sharing 
    }
}

public class private1{
    public static void main(String[] args) {
        
        student1 student = new student1();
        System.out.println(student.names);
        student.show();                     // another class so dont show
    
    }
}