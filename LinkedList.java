import java.util.HashSet;

public class LinkedList {

    public class Node {
        public int data;
        public Node next;

        public Node(int value){
            this.data=value;
            this.next=null;
        }
    }

    private Node head;

// Function for Sorted Insertion
    public void insertNode(int value){
        if (head == null) {
            head = new Node(value);
            return;
        }
        if(head.data>value){
            Node node = new Node(value);
            node.next=head;
            head=node;
            return;
        }

        Node ptr = head;
        Node prev =null;

        while(ptr!=null && ptr.data <value ) {
            prev=ptr;
            ptr = ptr.next;
        }

        Node new_node = new Node(value);
        prev.next=new_node;
        new_node.next=ptr;

    }
// Function to print linkedlist

    public void printList(){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(" "+ptr.data);
            ptr=ptr.next;
        }
    }

// To detect loop in linked list

    public boolean detectLoop(){
//        Node slowPtr=head;
//        Node fastPtr=head;
//        while(slowPtr!=null){
//            slowPtr=slowPtr.next;
//            fastPtr=fastPtr.next.next;
//            if(slowPtr.data==fastPtr.data)
//                return true;
//        }
//        return false;
        Node refPtr=head;
        HashSet<Node> hashSet = new HashSet<Node>();
        while(refPtr!=null) {

            if(hashSet.contains(refPtr))
                return true;

            hashSet.add(refPtr);
            refPtr=refPtr.next;
        }
        return false;
    }

// Function to delete a node in the list if it exists

    public boolean delete(int value){
        if(head.data==value){
            head=head.next;
            return true;
        }
        Node ptr =head;
        Node prev =null;
        while(ptr!=null && ptr.data!=value ){
            prev=ptr;
            ptr=ptr.next;
        }
        if(ptr == null)
            return false;
        else
            prev.next=ptr.next;
        return true;
    }

 // Function to reverse a singly linked list

    public Node reverseList(){
        Node curPtr=head;
        Node prev=null;
        Node next= null;
        while(curPtr!=null){
            next=curPtr.next;
            curPtr.next=prev;
            prev=curPtr;
            curPtr=next;
        }
        head=prev;
        return head;
    }

// Function to get Nth node from the end in single traversal

    public int getNthNode(int index){
        Node refPtr=head;
        Node mainPtr=head;

        for (int i=0;i<index;i++){
            refPtr=refPtr.next;
        }
        while (refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr.data;
    }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(5);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(8);


        ll.head.next.next.next.next=ll.head;
        if(ll.detectLoop())
            System.out.println("There is a loop");
        else
            System.out.println("No loop exists in the list");


        if(ll.delete(8))
            System.out.println("Successfully deleted");
        else
            System.out.println("Value not found");

        ll.printList();
        int num=ll.getNthNode(3);
        System.out.println("Third last node is :"+num);
        ll.head=ll.reverseList();
        System.out.println("After reversing");
        ll.printList();
    }
}