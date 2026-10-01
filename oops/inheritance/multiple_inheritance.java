/*
4. Multiple Inheritance
- One child → multiple parents

But java does not support multiple inheritance through classes,
- so we can achieve it using interfaces
*/

package oops.inheritance;

interface father{
    void cash();
}

interface mother{
    void gold();
}

class son1 implements father , mother {

    public void savings(){
        System.out.println("i have my savings");
    }

    // here need to provide public method to access from main class
    public void cash(){                    
        System.out.println("dad's salary");
    }
    
    // cause java doesnt allow class multiple inheritance so public 
    public void gold(){
        System.out.println("gold purchased by mom's savings");
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        
        son1 s = new son1();
        s.cash();
        s.gold();
        s.savings();
    }
}
