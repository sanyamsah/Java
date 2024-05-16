public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;
    public Linkedlist(){
        this.size = 0;
    }
    public void insertAtFirst(int val){
        Node node = new Node();
        node.value = val;
        node.next = head;
        head = node;
        if(tail == null) tail = head;
        size++;
    }
    public void insertAtEnd(int val){
        Node node = new Node();
        if(head==null && tail==null){
            insertAtFirst(val);
        }
        else {
            node.value = val;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.next != null) System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }
//    public Linkedlist(int size){
//        this.size = size;
//    }
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
    }
}
