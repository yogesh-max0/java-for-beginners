/*

final means: "this cannot be changed."
--It can be used with:
1)Variables
2)Methods
3)Classes

*/

package keywords;

class animal3{
    final void sound(){   // this cant be used again 
        System.out.println("animal sounds");
    }
}

class dog extends animal3{
    // we cant use the same method here cause we given the final keyword there
    {
        System.out.println("dog class is incomplete due to animal class used final keyword");
    }
}

public class final_keyword {
    public static void main(String[] args) {

        // final doesnt allow us to override
        animal3 a = new animal3();
        a.sound();
    }
}
