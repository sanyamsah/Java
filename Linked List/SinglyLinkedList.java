public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Size of the linked list
    public int getSize(){
        return size;
    }

    // Constructor
    public SinglyLinkedList(){
        this.size = 0;
    }

    // Returns reference to the specified index/node
    public Node getAtIndex(int idx){
        Node node = head;
        for(int i=0; i<idx; i++){
            node = node.next;
        }
        return node;
    }

    // Inserts element at first index
    public void insertAtFirst(int val){
        Node node = new Node();
        node.value = val;
        node.next = head;
        head = node;
        if(tail == null) tail = head;
        size++;
    }

    // Inserts element at last index
    public void insertAtLast(int val){
        Node node = new Node();
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        node.value = val;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    // Inserts element at specified index
    public void insertAtIndex(int idx, int val){
        if(idx == 0){
            insertAtFirst(val);
            return;
        }
        if(idx == size){
            insertAtLast(val);
            return;
        }
        Node node = new Node(val, null);
        Node temp = getAtIndex(idx-1);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void recursiveInsert(int index, int val){
        head = recursiveInsert(val, index, head);
    }

    private Node recursiveInsert(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = recursiveInsert(val, index - 1, node.next);
        return node;
    }

    // Deletes element of first index
    public int deleteAtFirst(){
        int val = head.value;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
    }

    // Deletes element of last index
    public int deleteAtLast(){
        if(size <= 1) return deleteAtFirst();
        int val = tail.value;
        Node secondLast = getAtIndex(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // Deletes element of the specified index
    public int deleteAtIndex(int idx){
        if(idx == 0) return deleteAtFirst();
        if(idx == size-1) return deleteAtLast();
        Node previous = getAtIndex(idx-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return val;
    }

    // Finds the searched element & returns it's index
    public int search(int val){
        Node node = head;
        int index = 0;
        while(node != null){
            if(node.value == val){
                return index;
            }
            index++;
            node = node.next;
        }
        return -1;
    }

    // Prints the list & it's size
    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.next != null) System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size: " + size);
        System.out.println();
    }

    // Node class with value & pointer to next node
    private class Node{
        int value;
        Node next;

        Node(){
            this.value = 0;
            this.next = null;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        // Returns the index of a node
        public int index(){
            Node node = head;
            for(int i=0; i<size; i++){
                if(this == node) return i;
                node = node.next;
            }
            return -1;
        }
    }
}
