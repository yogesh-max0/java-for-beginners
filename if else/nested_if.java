public class nested_if{
    public static void main(String[] args) {
        
        int age = 1;
        boolean indian = true;

        if(age >=18){

            if(indian){
                System.out.print("citizen must be eligible to vote");
            }
            else{
                System.out.print("need to be citizen");
            }
        }
        else{
            System.out.print("need to be 18 to vote");
        }
    }
}