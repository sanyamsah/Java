public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------SINGLY LINKED LIST------------------------");
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtFirst(0);
        list.print();
        list.recursiveInsert(6,99);
        list.print();
        System.out.println("Deleted: " + list.deleteAtFirst());
        list.print();
        System.out.println("Deleted: " + list.deleteAtLast());
        list.print();
        System.out.println("Deleted: " + list.deleteAtIndex(3));
        list.print();
        list.insertAtFirst(0);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtLast(7);
        list.print();
        System.out.println("Element found at index: " + list.search(5));
        System.out.println("Element found at index: " + list.search(0));
        System.out.println("Element found at index: " + list.search(7));
        System.out.println("Element found at index: " + list.search(99));
        System.out.println();

        System.out.println("------------------------DOUBLY LINKED LIST------------------------");
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.insertAtLast(5);
        dList.print();
        dList.insertAtLast(4);
        dList.print();
        dList.insertAtLast(3);
        dList.print();
        dList.insertAtLast(2);
        dList.print();
        dList.insertAtLast(1);
        dList.print();
        dList.printReverse();
        System.out.println();
        dList.insertAtLast(6);
        dList.print();
        dList.insertAtIndex(4,99);
        dList.print();
        int index = dList.search(6);
        System.out.println("Element found at index: " + index);
        int val = dList.deleteAtFirst();
        System.out.println("Deleted element: " + val);
        dList.print();
        val = dList.deleteAtLast();
        System.out.println("Deleted element: " + val);
        dList.print();
        val = dList.deleteAtIndex(3);
        System.out.println("Deleted element: " + val);
        dList.print();

        System.out.println("------------------------CIRCULAR LINKED LIST------------------------");
        CircularLinkedList cList = new CircularLinkedList();
        cList.insertAtFirst(5);
        cList.insertAtFirst(4);
        cList.insertAtFirst(3);
        cList.insertAtFirst(2);
        cList.insertAtFirst(1);
        cList.print();
        cList.insertAtIndex(6,99);
        cList.print();

    }
}
