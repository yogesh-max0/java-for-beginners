public class logical_oper_example {
    public static void main(String[] args)
    {
        // ( AND )

        int age = 22;
        int salry = 25000;
        System.out.print((age >=18 && salry >=18000) +"\n");
        
        
        // ( OR )

        int ages = 22;
        int lpa = 250000;
        System.out.print((ages >=18 || lpa >=200000) + "\n");

        
        // ( NOT )

        boolean student = true;
        System.out.print((!student)+"\n");


        // ( all three combined )

        int AGE = 22;
        int SALARY = 20000;
        boolean STUDENT = true;
        
        System.out.print((AGE >=18 && SALARY >=18000 && STUDENT)+"\n");
        System.out.print((AGE >=18 || SALARY >=18000 || STUDENT)+"\n");
        System.out.print( ! STUDENT );
    }
}
