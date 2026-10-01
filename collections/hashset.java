// HashSet used to store original values only 
// it doesnt allow duplicate values


import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        
        HashSet<Integer> a = new HashSet<Integer>();

        a.add(10);
        a.add(20);
        a.add(10);
        
        System.out.println(a.size());

        System.out.println(a.contains(10));

        System.out.println(a);
    }
}
