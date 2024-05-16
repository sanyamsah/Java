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

    public void insertAtIndex(int idx, int val){
        if(idx == 0){
            insertAtFirst(val);
            return;
        }
        if(idx == size-1){
            insertAtEnd(val);
            return;
        }
        Node node = new Node(val, null);
        Node temp = head;
        int count=0;
        while(count != idx-1){
            count++;
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
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
