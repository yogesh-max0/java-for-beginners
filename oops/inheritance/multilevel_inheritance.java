/*
2. Multilevel Inheritance
Grandparent → Parent → Child
*/

package oops.inheritance;

class animal{
    void eat(){
        System.out.println("(interesting things about whale:):");
        System.out.println("whale is non huntable animal");
    }
}

class mammal extends animal{
    void swim(){
        System.out.println("whale is the only swimming mammal");
    }
}

class whale extends mammal{
    void sea_creature(){
        System.out.println("only biggest sea mammal is whale");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        whale whale = new whale();

        whale.eat();;
        whale.swim();
        whale.sea_creature();
    }
}
