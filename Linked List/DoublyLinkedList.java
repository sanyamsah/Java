public class DoublyLinkedList {
    private int size;
    private Node head;
    private Node tail;

    public void getHeadAndTail(){
        System.out.println("Head: " + head.value);
        System.out.println("Tail: " + tail.value);
    }

    public Node getAtIndex(int idx){
        Node node = head;
        for(int i=0; i<idx; i++){
            node = node.next;
        }
        return node;
    }

    public void insertAtFirst(int val){
        Node node = new Node(null, val, null);
        node.next = head;
//        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
        if(tail == null) tail = head;
        size++;
    }

    public void insertAtLast(int val){
        if(tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(null, val, null);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAtIndex(int idx, int val){
        if(idx == 0) {
            insertAtFirst(val);
            return;
        }
        if(idx == size) {
            insertAtLast(val);
            return;
        }
        Node node = new Node(null, val, null);
        Node temp = getAtIndex(idx - 1);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.next != null) System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size: " + size);
        System.out.println();
    }

    public void printReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.prev != null) System.out.print("<-");
            temp = temp.prev;
        }
        System.out.println();
    }

    private class Node{
        Node prev;
        int value;
        Node next;
        Node(){
            this.prev = null;
            this.value = 0;
            this.next = null;
        }
        Node(Node prev, int val, Node next){
            this.prev = prev;
            this.value = val;
            this.next = next;
        }
        Node(int val){
            this.value = val;
            this.prev = null;
            this.next = null;
        }
    }
}
