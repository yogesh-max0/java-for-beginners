//used to store data in key value pairs 
// hashmap also doesnt allow duplicates

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<Integer,String>();
        
        students.put(1,"yogi");
        students.put(2,"vicky");
        students.put(1,"yogesh");
        students.put(3,"yogi");

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("yogi"));

        students.remove(1);

        System.out.println(students);
    }
}
