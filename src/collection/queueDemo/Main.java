package collection.queueDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Queue q1=new LinkedList();
        q1.add("Pihu");
        q1.offer("aaa");
        q1.offer("bbb");
        System.out.println(q1.poll());
        System.out.println(q1.peek());
//        for (Object i : q1)
//            System.out.println(i);
        System.out.println("==========================================");

        PriorityQueue pq= new PriorityQueue();
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(20);
        pq.add(16);
        System.out.println( pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());


    }
}
