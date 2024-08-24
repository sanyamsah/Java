public class Test {
    public class Node{
        int data;
        int size;
        Node next;
        Node(int data){
            this.data = data;
        }
        Node(){
            this(0);
        }
        public void insert(int data){
            if(size == 0){
                this.data = data;
                size++;
                return;
            }
            Node ptr = new Node(data);
            Node temp = this;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = ptr;
            size++;
        }
        public void display(Node node){
            while(node.next != null){
                System.out.println(node.data);
            }
        }

    }
    
}
