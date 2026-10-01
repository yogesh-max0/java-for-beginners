
// we have to import scanner to get user input

import java.util.Scanner;

class user_input{
    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in);
        System.out.println("enter your full name:"+"\n");

        String name = input.nextLine();  // use next for string
        System.out.println(name+"");

        System.out.println("enter your another name:"+"\n");
        String names = input.nextLine(); // use nextline for full next line
        System.out.println(names+"");

        System.out.println("enter your age:"+"\n");
        int age = input.nextInt();  // use nextInt for integers (numbers)
        System.out.println(age+"");
        
        System.out.println("enter your mobile number:"+"\n");
        long a = input.nextLong();   // use nextlong for large integers (numbers)
        System.out.println(a+5+"");

        System.out.println("enter percentage:"+"\n");
        float b = input.nextFloat(); // use nextFloat for float functions
        System.out.println(b+"");

        System.out.println("true or false:"+"\n");
        boolean c = input.nextBoolean(); // use nextboolean for boolean
        System.out.println(c+"\n");

        System.out.println("enter charactes:"+"\n");
        char d = input.next().charAt(3); // use nextchar and charAt for finding index of characters
        System.out.println(d+"\n");

        input.close();  // close the input section after done
    }
}
