import java.util.Scanner;

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
        public void display(){
            Node node = this;
            while(node != null){
                System.out.println(node.data);
                node = node.next;
            }
        }

        public static void main(String[] args) {
            Node head = new Node();
//            head.insert(1);
//            head.insert(2);
//            head.insert(3);
//            head.insert(4);
//            head.insert(5);
//            head.display();
//            System.out.println(head.size);
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            for(int i = 0; i < n; i++){
                head.insert(input.nextInt());
            }
            head.display();
            System.out.println("Size: " + head.size);
        }
    }