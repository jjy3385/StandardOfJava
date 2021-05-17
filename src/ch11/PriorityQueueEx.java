package ch11;

import java.util.*;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3);    //pq.offer(new Integer(3)) 오토박싱
        pq.offer(new Integer(1));
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        Object obj = null;
        while ((obj = pq.poll()) != null)
            System.out.println(obj);
    }
}
