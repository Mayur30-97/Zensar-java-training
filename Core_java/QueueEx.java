package Core_java;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(21);
        q.offer(78);
        q.offer(26);

        q.poll();

        System.out.println(q.isEmpty());
        q.forEach(System.out::println);
    }
}
