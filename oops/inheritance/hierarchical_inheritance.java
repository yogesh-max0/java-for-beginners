/*
3. Hierarchical Inheritance
One parent → multiple children
*/

package oops.inheritance;

class grandpa{
    void land(){
        System.out.println("grandpa had a land for dad");
    }
}

class dad extends grandpa{
    void business(){
        System.out.println("dad had a business for me");
    }
}

class son extends grandpa{
    void car(){
        System.out.println("i have car myself");
    }
}

public class hierarchical_inheritance{
    public static void main(String[] args) {
        
        dad d = new dad();
        d.land();

        son s = new son();
        s.land();
        s.car();
    }
}
