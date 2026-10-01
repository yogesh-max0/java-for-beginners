package loops;
/* method calls itself to solve a problem

1) Base Case: The stopping condition that returns a value without making another method call. Without this,
the program will crash with a StackOverflowError.

2) Recursive Case: The part of the method where it calls itself. Each call must modify the input arguments 
to move closer to the base case.
*/

public class recursion{
    
    public static void count(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        count(n-1);
    }
    public static void main(String[] args) {
        count(5);
    }
}