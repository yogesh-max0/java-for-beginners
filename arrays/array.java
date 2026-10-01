package arrays;
/* 
array in Java is fixed-size data structure that stores collection of elements of same data type in contiguous memory locations. 
Arrays can hold both primitive data types (like int, double, char) and object references (like String or custom objects).
Arrays store only one type of data.
*/

public class array{
    public static void main(String[] args) {
        int[] number = new int[6];            // using integers we can only assign integrs
        number[0]= 1;                            
        number[1]= 2;
        number[2]= 3;
        number[3]= 4;
        number[4]= 5;
        number[5]= 6;
        System.out.print((number[3])+"\n");

        String[] cars = {"volvo","BMW","audi","benz","renault"}; // using string we can assign only strings
        System.out.print((cars[4])+","+cars[2]+"\n");

        double[] floa = new double[5];         // using double we can only assign double
        floa[0]= 0.11;
        floa[1]= 0.21;
        floa[2]= 0.11;
        floa[3]= 11;
        floa[4]= 0.11;
        System.out.print(floa[4]+"\n");

        boolean[] guess = new boolean[5];     // using boolean we can only assign boolean
        guess[0]= true;
        guess[1]= false;
        guess[2]= true;
        guess[3]= false;
        guess[4]= false;
        System.out.print(guess[2]+"\n");
        
    }
}