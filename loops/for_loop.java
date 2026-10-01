package loops;
public class for_loop{
    public static void main(String[] args) {
        
        for(int a = 10; a>5; a--){
            System.out.print(a+"\n");  // if condition is true so the loop runs non-stop
        }
        for(int b =0; b<=5; b++){
            System.out.print(b+"\n");  // if the condition is false so the loop ends
        }
        
        int num = 5;
        int sum = 0;
        for(int ab = 1; ab<=num; ab++){
            sum += ab;
        }
        System.out.print(sum+"\n");        // sum of the values finding
        
        int nums=6;
        int factorial = 1;
        for(int fact = 1; fact<=nums; fact++){
            factorial *= fact;
        }
        System.out.print(factorial);      // factorial finding
    }
}