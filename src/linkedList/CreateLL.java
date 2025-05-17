package linkedList;
import java.util.Scanner;

//with head
public class CreateLL {

     static class Node{
         int data;
         Node next;

         Node(int data){
             this.data=data;
         }
    }
    static void insertAtLast(Node head,int value){
        Node val=new Node(value);
        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=val;
    }
    static void display(Node head){
         Node temp= head;
         while(temp != null){
             System.out.println(temp.data);
             temp=temp.next;
         }
    }
    static void length(Node head){
         int count=0;
         Node temp=head;
         if(temp==null){
             System.out.println("List empty");
         } else{
            while (temp != null) {
                count++;
                temp = temp.next;
            }
         }
        System.out.println("Length............." + count);
    }
    static Node create(Node head){
         Node temp=head;
        int i=0;
        int n=5;

        while(temp!=null && i<n){
            temp.next=new Node(i);
            temp=temp.next;
            i++;
        }
        return head;
    }



    public static void main(String[] args) {
        Node head=new Node(10);
        head=create(head);
        display(head);
        System.out.println();
        length(head);

        System.out.println("\n Printing 12 at last=====================================>");
        insertAtLast(head,12);
        display(head);
        System.out.println("\n Reversed list");
//        reverseList1(head);
    }


}
