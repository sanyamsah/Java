public class CircularQueue {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue(int size){
        this.arr = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue full.");
            return false;
        }
        arr[end++] = item;
        end = end % arr.length;
        size++;
        return true;
    }

    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue empty.");
        }
        int removed = arr[front++];
        front = front % arr.length;
        size--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't peek on empty queue");
        }
        return arr[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(arr[i] + " -> ");
            i++;
            i %= arr.length;
        } while(i != end);
        System.out.println("END");
    }
}
