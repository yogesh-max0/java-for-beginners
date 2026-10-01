/*
this is very commonly used inside a constructor, especially when the constructor parameter 
has the same name as the class field.
*/

package keywords;

class fruits{
    String name;
    int expiry;

    fruits(String name , int expiry){
        this.name = name;
        this.expiry = expiry;
    }

    void display(){
        System.out.println(name);
        System.out.println(expiry);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        fruits f = new fruits("mosambi", 4);
        f.display();

    }
}
