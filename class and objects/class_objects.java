// A class defines what an object has and does.
// An object is an actual instance of the class.


class apply{
    String name;
    String dob;
    int age;

    public void display(){
        System.out.println("application");
        System.out.println("name:"+"          "+name);
        System.out.println("date-of-birth:"+" "+dob);
        System.out.println("age:"+"           "+age);
    }
}

public class class_objects{
    public static void main(String[] args) {
        
        apply form = new apply();

        form.name = "yogeshwaran";
        form.dob = "29-12-2003";
        form.age = 22;

        form.display();
    }
}