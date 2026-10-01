// A queue generally follows FIFO — first in, first out.
// so it gives first value only in output

import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Yogi");
        queue.add("Vicky");

        System.out.println(queue.poll());
    }
}