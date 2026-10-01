package constructors;


class student{
    String name;
    int age;

    student(String name , int age){
        this.name = name;
        this.age = age;
    }
}

public class Parameterized_Constructor{
    public static void main(String[] args) {
        student student = new student("yogi",22);

        System.out.println(student.name);
        System.out.println(student.age);
    }
}