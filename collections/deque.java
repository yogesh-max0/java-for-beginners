// Deque means double-ended queue. You can add/remove from both ends

import java.util.ArrayDeque;
import java.util.Deque;

public class deque{
    public static void main(String[] args) {

        Deque<String> names = new ArrayDeque<>();

        names.addFirst("Yogi");
        names.addLast("Vicky");

        System.out.println(names);
    }
}