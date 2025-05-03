```java

public class LinkedList {
    
    //properties of linked list
    Node head, tail;
    int size;
    
    //initializing properties with default values
    public LinkedList(){
        head=tail=null;
        size=0;
    }
    
    //node creation
    class Node {
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void main(String[] args) {
        Node node1= new Node("element1");
        Node node2= new Node("element2");
        Node node3= new Node("element3");
        Node node4= new Node("element4");
        Node node5= new Node("element5");

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        System.out.println(node5.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);
    }
}

```
```java
//if we want to print recursively

    public static void display(Node head){
        if(head==null)
            return;
        System.out.println(head.data);
        display(head.next);

    }
```
