// a single unit or group of multiple objects treated as a single entity
// used to store data more efficiently and easy to process
// also allows duplicates


import java.util.ArrayList;

public class array_list{
    public static void main(String[] args) {
        
        // integer collection used to store add only integers
        ArrayList<Integer> a = new ArrayList<Integer>();
        // arraylist allows redudancy so we can repeat same values
        a.add(1);
        a.add(1);
        a.add(1);
        

        // normal add
        a.add(1);

        // add using index
        a.add(0,3); 

        // update the value at given index
        a.set(0, 4);

        // remove the firstvalue 
        a.removeFirst();

        // remove last value
        a.removeLast();


        // string collection used to store add only string
        ArrayList<String> b = new ArrayList<String>();
        b.add("yogi");

        
        // we can also process collections without declare datatype
        ArrayList<Object> c = new ArrayList<Object>();
        c.add("hello");
        c.add(1);
        c.add(0.5);
        
        System.out.println(a.get(0));
        System.out.println(b);
        System.out.println(c);

}
}