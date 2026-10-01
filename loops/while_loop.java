package loops;
public class while_loop {
    public static void main(String[] args) {
        
        int a = 1;

        while(a<=9){
            System.out.print((a)+"\n");   // basic while loop
            a++;
        }

        int num = 5;
        int factorial = 1;
        int i = 1;

        while(i<=num){
            factorial *= i;
            i++;
        }
        System.out.print(factorial+"\n");     // factorial finding using while loop

        
        int sum =5;
        int is = 1;
        while(is<=10){
            sum += is;
            is++;
        }
        System.out.print((sum)+"\n");         //  sum using while loop

    }
}
