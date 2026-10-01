/*

// ( WITHOUT LAMBDA )

interface MyInterface {
    void show();
}

public class Main {
    public static void main(String[] args) {

        MyInterface obj = new MyInterface() {
            public void show() {
                System.out.println("Hello");
            }
        };

        obj.show();
    }
}

*/


// A lambda expression is a shorter way to write a method/function-like piece of code.

interface MyInterface{
    void show(String name);
}

public class lambda{
    public static void main(String[] args) {
        MyInterface obj = (name)->{
            System.out.println("hello " + name);
        };
        obj.show("yogesh");
    }
}