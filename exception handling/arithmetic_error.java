/* 
Exception handling is used to handle errors that happen while a Java program is running, 
so the program doesn't suddenly stop

// types of exceptions
// checked
// unchecked
// errors
*/


/*
1. try and catch

The most basic exception handling is:

try {
    // code that might cause an exception
}
catch (Exception e) {
    // code to handle the exception
}
finally{
    // code
}    
*/

public class arithmetic_error {
     public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;  // ArithmeticException

            System.out.println(result);
        }
        catch (ArithmeticException e) { // this is ArithmeticException(e is name of exception)
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program continues");
        }
    }
}

// ** if we dont know what error then generally give Exception in catch 

/*
| Exception                           | Meaning                            | Example                              |
| ----------------------------------- | ---------------------------------- | ------------------------------------ |
| **ArithmeticException**             | Invalid arithmetic operation       | `10 / 0`                             |
| **ArrayIndexOutOfBoundsException**  | Array index is outside its range   | `arr[5]` when size is 5              |
| **StringIndexOutOfBoundsException** | String index is outside its range  | `"Hello".charAt(10)`                 |
| **NullPointerException**            | Trying to use a `null` reference   | `name.length()` when `name = null`   |
| **NumberFormatException**           | Invalid String → number conversion | `Integer.parseInt("abc")`            |
| **InputMismatchException**          | Wrong input type using `Scanner`   | Entering `"abc"` when `int` expected |
| **ClassCastException**              | Invalid type casting               | Casting an incompatible object       |
| **FileNotFoundException**           | File cannot be found               | Opening a nonexistent file           |
| **IOException**                     | Input/output operation fails       | File/network I/O problem             |
| **InterruptedException**            | A thread is interrupted            | During `Thread.sleep()`              |
 
*/
