package constructors;

class students{
    String name;
    int age;

    students(String n ,int a){
        name = n;
        age = a;
    }
}

public class normal_constructor{
    public static void main(String[] args) {
        students student = new students("yogi",22);

        System.out.println(student.name);
        System.out.println(student.age);
    }
}