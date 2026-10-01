/*
A class is like a ready-made tool that contains data and methods (functions).
Java has already created that class so we can use it directly instead of creating
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class predefinedclasses {

    public static void main(String[] args) {

        // 1. String
        String name = "Yogesh";

        System.out.println("1. String");
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println();

        // 2. Scanner
        System.out.println("\n2. Scanner");

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your age: ");

        try {
            int age = s.nextInt();
            System.out.println("Your age is: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        }


        // 3. Math
        System.out.println("\n3. Math");

        System.out.println("Maximum: " + Math.max(10, 20));
        System.out.println("Minimum: " + Math.min(10, 20));
        System.out.println("Square root: " + Math.sqrt(25));


        // 4. Arrays
        System.out.println("\n4. Arrays");

        int[] numbers = {10, 20, 30, 40};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Array length: " + numbers.length);


        // 5. Integer
        System.out.println("\n5. Integer");

        String number = "100";

        int value = Integer.parseInt(number);

        System.out.println("String: " + number);
        System.out.println("Converted to int: " + value);


        // 6. Double
        System.out.println("\n6. Double");

        String decimal = "25.50";

        double d = Double.parseDouble(decimal);

        System.out.println("String: " + decimal);
        System.out.println("Converted to double: " + d);


        // 7. Character
        System.out.println("\n7. Character");

        char ch = 'A';

        System.out.println("Character: " + ch);
        System.out.println("Is letter: " + Character.isLetter(ch));
        System.out.println("Is digit: " + Character.isDigit(ch));


        // 8. Boolean
        System.out.println("\n8. Boolean");

        String check = "true";

        boolean result = Boolean.parseBoolean(check);

        System.out.println("String: " + check);
        System.out.println("Converted to boolean: " + result);


        // 9. ArrayList
        System.out.println("\n9. ArrayList");

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        System.out.println("Cars: " + cars);
        System.out.println("First car: " + cars.get(0));


        // 10. Exception
        System.out.println("\n10. Exception");

        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }


        // Program completed
        System.out.println("\nProgram completed.");

        s.close();
    }
}