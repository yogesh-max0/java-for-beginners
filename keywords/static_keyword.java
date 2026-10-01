/*
How to use static keyword:

static variable:
static keyword is used to declare a variable that belongs to the class and not to individual objects.
----------------------------------------------------------------------------------

class Student {

    static String college;
}

Now college is not separate for every object.

There is only one college variable shared by all Student objects.

Think of it like this:

             Student class
                  |
          college = "MAM"
             /          \
            /            \
          s1              s2
*/

package keywords;

class student{
    String name;
    static String college = "xyz college"; // it can be used for n number of objects
}

public class static_keyword{
    public static void main(String[] args) {
        student s1 = new student();   
        s1.name = "yogesh";  // 1st object using same college
        student s2 = new student();
        s2.name = "vignesh"; // 2nd object using same college 

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(student.college);
    }
}