public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.display();
//        System.out.println(queue.peek()); // 1
//        queue.insert(6); // queue full
//        System.out.println(queue.delete()); // 1
//        System.out.println("Top element: " + queue.peek()); // 2
//        System.out.println(queue.delete());
//        System.out.println(queue.delete());
//        System.out.println(queue.delete());
//        System.out.println(queue.delete()); // 5
//        queue.display();
//        System.out.println(queue.peek()); // exception
//        System.out.println(queue.delete()); // exception

        CircularQueue cQueue = new CircularQueue(5);
        cQueue.insert(1);
        cQueue.insert(2);
        cQueue.insert(3);
        cQueue.insert(4);
        cQueue.insert(5);
        cQueue.display();
        System.out.println(cQueue.peek()); // 1
        cQueue.insert(6); // queue full
        System.out.println(cQueue.delete()); // 1
        System.out.println("Top element: " + cQueue.peek()); // 2
        System.out.println(cQueue.delete());
        System.out.println(cQueue.delete());
        System.out.println(cQueue.delete());
        System.out.println(cQueue.delete()); // 5
        cQueue.display();
        System.out.println(cQueue.peek()); // exception
        System.out.println(cQueue.delete()); // exception
    }
}
