package loops;
/*do-while loop is an exit-controlled loop that guarantees the code block will execute 
at least once before evaluating the conditional expression*/


public class do_while_loop {
    public static void main(String[] args) {
        
        int count = 0;

        do{
            System.out.print("yogi\n");
            count = count+1;
        }while(count<=1);

        
        int a = 10;

        do{
            System.out.print(a);
            ++a;
        }while(a<=5);
    }
}
