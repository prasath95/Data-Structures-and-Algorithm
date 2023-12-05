package algorithm.linkedlist;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node=new Node();
        node.data=data;

        if(head==null){
            head=node;
        }else{
            //find the last node and 
            //make that to point this newly created node as next
            Node n=head;
            while (n.next!=null) {
                n=n.next;
            }
            n.next=node;
        }
    }

    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=head; 
        head=node;
    }

    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null; 

        Node n=head;
        for (int i = 0; i <= index; i++) {
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }

    public void show(){
        while (head.next!=null) {
            System.out.println(head.data);
            head=head.next;
        }
         System.out.println(head.data);
    }
}
