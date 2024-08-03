import java.util.Arrays;

public class MinHeap {
    int[] arr;
    int size, capacity;
    public MinHeap(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }
    public int leftChild(int i){
        return 2*i+1;
    }
    public int rightChild(int i){
        return 2*i+2;
    }
    public int parent(int i){
        return (i-1)/2;
    }
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void insert(int item){
        if(size == capacity) return;
        size++;
        int i = size - 1;
        arr[i] = item;
        while(i != 0 && arr[parent(i)] > arr[i]){
            swap(arr, parent(i), i);
            i = parent(i);
        }
    }
    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void minHeapify(int i){
        int left = leftChild(i);
        int right = rightChild(i);
        int small = i;
        if(left < size && arr[left] < arr[i]){
            small = left;
        }
        if(right < size && arr[right] < arr[small]){
            small = right;
        }
        if(small != i){
            swap(arr, i, small);
            minHeapify(small);
        }
    }
    public void decreaseKey(int i, int x){
        arr[i] = x;
        while(i != 0 && arr[parent(i)] > arr[i]){
            swap(arr, parent(i), i);
            i = parent(i);
        }
    }
    public static void minHeapify(int i, int[] a){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int small = i;
        if(left < a.length && a[left] < a[i]){
            small = left;
        }
        if(right < a.length && a[right] < a[small]){
            small = right;
        } // smallest among the three nodes: root, left and right
        if(small != i){
            int temp = a[i];
            a[i] = a[small];
            a[small] = temp;
            minHeapify(small, a);
        }
    }
    public int extractMin(){
        if(size == 0) return Integer.MAX_VALUE;
        if(size == 1){
            size--;
            return arr[0];
        }
        swap(arr, 0, size-1);
        size--;
        minHeapify(0);
        return arr[size];
    }
//    public int delete(int i){
//        int deleted = arr[i];
//        decreaseKey(i, Integer.MIN_VALUE);
//        extractMin();
//        return deleted;
//    }
    public int delete(int i) {
        if (i < 0 || i >= size) return -1;
        int deleted = arr[i];
        arr[i] = arr[size - 1];
        size--;
        minHeapify(i);
        return deleted;
    }
    public static int extractMin(int[] a){
        int len = a.length;
        if(len == 0) return Integer.MAX_VALUE;
        if(len == 1){
            len--;
            return a[0];
        }
        int temp = a[0];
        a[0] = a[len-1];
        a[len-1] = temp;
        len--;
        minHeapify(0, a);
        return a[len];
    }
    public static void buildMinHeap(int[] array){
        for(int i = (array.length-2)/2; i >= 0; i--){ // from bottom-most right-most internal node to first node
            minHeapify(i, array);
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(6);
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);
        heap.print();
//        heap.decreaseKey(4,0);
//        heap.print();
        System.out.println("Deleted element: " + heap.delete(3));
        heap.print();
//        System.out.println("Minimum: " + heap.extractMin());
//        heap.print();
//        int[] brr = {40,20,30,35,25,80,32,100,70,60};
//        minHeapify(0,brr);
//        System.out.println(Arrays.toString(brr));
//        System.out.println("Minimum: " + extractMin(brr));
//        System.out.println(Arrays.toString(brr));
        int[] array = {10,5,20,2,4,8};
        buildMinHeap(array);
        System.out.println(Arrays.toString(array));
    }
}
