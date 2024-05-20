public class CircularLinkedList {
    int size;
    Node head;
    Node tail;

    public Node getAtIndex(int idx){
        Node node = head;
        for(int i=0; i<idx; i++){
            node = node.next;
        }
        return node;
    }


    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) tail = head;
        else tail.next = head;
        size++;
    }

    public void insertAtLast(int val){
        if(size == 0){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
    }

    public void insertAtIndex(int idx, int val){
        if(idx == 0){
            insertAtFirst(val);
            return;
        }
        if(idx == size-1){
            insertAtLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = getAtIndex(idx-1);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void print(){
        Node temp = head;
        for(int i=0; i<=size; i++){
            if(i==size){
                System.out.println(" HEAD -> " + temp.value);
                return;
            }
            System.out.print(temp.value + "->");
//            if(i!=size) System.out.print("->");
            temp = temp.next;
        }
    }

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
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
}
