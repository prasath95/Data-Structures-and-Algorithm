package algorithm.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insert(12);
        linkedList.insert(22);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.insert(41);

        linkedList.insertAtStart(34);
        linkedList.insertAtStart(55);

        linkedList.insertAt(2, 100);

        linkedList.show();
    }
}
