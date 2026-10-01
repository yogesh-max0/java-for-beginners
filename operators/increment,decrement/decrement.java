// decrement subracts the value by 1

public class decrement {
    public static void main(String args[])
    
    {
        int a = 5;
        System.out.print(a-- +"\n");       // the value will remian same cause we assigned in right side
        
        int b = 5;
        System.out.print(--b +"\n");       // now it will subract with 1 cause assigned left side output==> 4
        
        int c = 10;
        c--;
        System.out.print(c +"\n");         // now the output will be 9 cause it subracts with 1
    }
}
