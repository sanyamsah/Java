import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Queue is an interface
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek()); // 1
        System.out.println(queue.remove()); // 1
        System.out.println(queue.peek()); // 2

        // Doubly-ended Queue (Deck)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2); // adds to last
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.addFirst(99);
        deque.addLast(99);
        System.out.println(deque.remove()); // removes from first
        System.out.println(deque.removeLast()); // removes from last
        System.out.println(deque);
    }
}
