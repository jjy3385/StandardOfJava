package ch11;

import java.util.*;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();

        while(it.hasPrevious()){
            System.out.print(it.previous());
        }
        System.out.println();

        //두 while문의 순서를 바꿨을 땐, 정상작동하지 않음
        //ListIterator 내부적으로 현재 인덱스를 가르치고 있다는 뜻임(cursor)


    }
}
