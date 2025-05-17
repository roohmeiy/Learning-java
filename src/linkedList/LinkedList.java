package linkedList;

public class LinkedList {

    Node head= null;
    Node tail=null;
    int size=0;

    //node creation
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    //add at last
    void add(int value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
        }
        else {
            tail.next = temp;
        }
        tail=temp;
        size++;
    }

    //add at beginning
    void addAtBeginning(int value){
        Node temp=new Node(value);
        if(head==null){
            head=tail=temp;
        }
        else {
            temp.next=head;
            head=temp;
        }
        tail=temp;
        size++;
    }

    void insertAt(int index, int value) {
        if (index < 0)
            System.out.println("Index start from zero. Give valid index..........");
        else {
            Node val = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            val.next = temp.next;
            temp.next = val;
        }
    }

    void removeAt(int index) {
        if (index < 0)
            System.out.println("ERROR: Index start from zero. Give valid index..........");
        else if(index>size)
            System.out.println("ERROR: List only contains "+ size +" nodes");
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
        }
        size--;
    }

    void getAt(int index){
        if (index < 0)
            System.out.println("ERROR: Index start from zero. Give valid index..........");
        else if(index>size)
            System.out.println("ERROR: List only contains "+ size +" nodes");
        else {
            Node temp = head;
            for (int i = 0; i < index; i++)
                temp = temp.next;
            System.out.println(temp.data);
        }
    }

//    void reverseList(){
//        if(head==null)
//            System.out.println("List doesn't contain any element so can't reverse.................");
//        else {
//            Node current = head;
//            Node prev = null;
//            Node temp;
//            while (current != null) {
//                temp = current.next;
//                current.next = prev;
//                prev = current;
//                current = temp;
//            }
//            head = prev;
//        }
//    }

    static Node reverseList1(Node head){
        if(head==null || head.next==null)
            return head;

//        Node newHead=reverseList1(head.next);
//        Node headNext= head.next;
//        head.next.next= head.next;
//        head.next=null;
//        return newHead;
        Node newHead = reverseList1(head.next);
        head.next.next = head; // Corrected line
        head.next = null; // Break original link
        return newHead;
    }

    //display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        //without head
        LinkedList l1=new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println("Printing L1 ============================>");
        l1.display();
        System.out.println("Size: " + l1.size);
        System.out.println("Printing L1 after insertion at beginning ============================>");
        l1.addAtBeginning(6);   // ----------------> 6,1,2,3,4,5
        l1.display();
        System.out.println("Inserting 12 at 2nd index===============================>");
        l1.insertAt(2,12);      // 6,1,12,2,3,4,5
        l1.display();
        System.out.println("Removing node from 3rd index===============================>");
        l1.removeAt(3);        //6,1,12,3,4,5
        l1.display();
        System.out.println("Retrieving data at specified index ===============================>");
        l1.getAt(3);    //3
        System.out.println("Reverse a linked list ===========================================>");
//        l1.reverseList();           //5,4,3,12,1,6
        l1.head = reverseList1(l1.head);
        l1.display();
    }

}
