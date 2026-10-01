/*
1. Poly - many
2. Morphism - forms

So, Poly-morphism = many forms

In Java, Polymorphism can be achieved using:
1) Compile-time polymorphism --> Method Overloading
2) Runtime polymorphism --> Method Overriding
*/

// 1. Method Overloading
// Same method name, but different parameters.

package oops.polymorphism;

class calci{
    void add(int a ,  int b){
        System.out.println(a+b);
    }

    void add(int a , int b , int c){
        System.out.println(a+b+c);
    }

    void add(double a , double b){
        System.out.println(a+b);
    }
}


public class compile_time_polymoprhism {
    public static void main(String[] args) {
        
        calci c = new calci();
        c.add(100,111);
        c.add(10,20,30);
        c.add(12.3,29.2);
    }
}
