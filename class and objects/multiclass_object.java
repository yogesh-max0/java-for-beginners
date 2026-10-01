// we can also create multiple classes and objects 

class student{
    String name;
    int age;

    public void display_student(){
        System.out.println(name);
        System.out.println(age);
   
    }
}

class address{
    String state;
    String area;

    public void display_address(){
        System.out.println(state);
        System.out.println(area);
   
    }
}

class qualification{
    String higher_education;
    double percentage;

    public void display_studies(){
        System.out.println(higher_education);
        System.out.println(percentage);
   
    }
}

public class multiclass_object{
    public static void main(String[] args) {

        System.out.println("student details:");
        student student = new student();
        student.name = "yogeshwaran";
        student.age = 22;
        student.display_student();
        System.out.println("");

        System.out.println("student address:");
        address address = new address();
        address.state = "tamilnadu";
        address.area = "ulundurpet";
        address.display_address();
        System.out.println("");

        System.out.println("student qualification:");
        qualification qualification = new qualification();
        qualification.higher_education = "under graduate(B-TECH / IT)";
        qualification.percentage = 93.9;
        qualification.display_studies();
 
    }
}