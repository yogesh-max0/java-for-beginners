import java.util.InputMismatchException;
import java.util.Scanner;

public class user_input_error {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("enter age:");
            int age = s.nextInt();
            System.out.println("age:" + age );
        }
        catch(InputMismatchException e){
            System.out.println("enter age not name");
        }
        finally{
            System.out.println("Program continues");
        }
        s.close();
    }
}
