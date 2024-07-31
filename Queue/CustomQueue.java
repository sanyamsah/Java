public class CustomQueue {
    private int[] arr;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size){
        this.arr = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return end == arr.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue full.");
            return false;
        }
        arr[end++] = item;
        return true;
    }

    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue empty.");
        }
        int removed = arr[0];
        for(int i = 1; i < end; i++){
            arr[i-1] = arr[i];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't peek on empty queue");
        }
        return arr[0];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }
        for(int i = 0; i < end; i++){
            System.out.print(arr[i] + " <- ");
        }
        System.out.println("END");
    }
}
