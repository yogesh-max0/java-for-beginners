package constructors;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }
    
}

public class copy_constructor {

    public static void main(String[] args) {

        Student student1 = new Student("Yogi", 22);

        Student student2 = new Student("vicky",26);

        Student student3 = new Student(student2);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student3.name);
        System.out.println(student3.age);
    }
}