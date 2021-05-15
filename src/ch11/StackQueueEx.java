package ch11;

import java.util.*;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println(st.search("2"));
        // 가장 마지막에 입력한 객체의 인덱스가 1
        // 그러니까 가장 먼저 접근하게 될 객체가 가장 마지막에 입력한 객체란 뜻임

        System.out.println("= Stack =");
        while(!st.empty()){
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }



    }
}
