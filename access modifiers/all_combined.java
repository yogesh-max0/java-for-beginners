package access_modifiers;

class student{

    public String name = "yogi";
    private Integer number = 1234567890;
    protected String course = "BTECH - IT";

    public void display(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(course);
    }
}

public class all_combined{
    public static void main(String[] args) {
        student student = new student();
        System.out.println(student.name);
        // System.out.println(student.number);  // private class so we cant able to see 
        System.out.println(student.course);
    }
}