public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.print();
        list.insertAtIndex(3,3);
        list.print();
    }
}
