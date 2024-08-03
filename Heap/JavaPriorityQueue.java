import java.util.Collections;
import java.util.PriorityQueue;
public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(55);
        pq.add(2);
        for(Integer element : pq){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Top element: " + pq.peek()); // 10
        System.out.println("Deleted: " + pq.poll()); // 10 (delete first element and min heapify)
        System.out.println(pq.peek()); // 20
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        pqMax.add(5);
        pqMax.add(4);
        pqMax.add(3);
        pqMax.add(2);
        pqMax.add(1);
        for(Integer element : pqMax){
            System.out.print(element + " ");
        }
    }
}
