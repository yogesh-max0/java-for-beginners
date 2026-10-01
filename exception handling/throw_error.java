public class throw_error {
    public static void main(String[] args) {

        try {
            int age = 15;

            if (age < 18) {
                throw new ArithmeticException("Age must be 18 or above");
            }

            System.out.println("Eligible");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("so not able to drive");
        }
    }
}