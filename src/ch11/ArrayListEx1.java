package ch11;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        //음... 기본자료형을 입력해도 내부적으로 래퍼클래스로 감싸는건가????
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1,list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");//지정된 위치에 객체를 저장
        //따로 어떤타입의 객체를 저장해야될지 지정하지 않아서 Integer/String 다 되는건가??
        print(list1,list2);

        //list1과 list2 겹치는 부분만 남기고 나머지는 제거
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1,list2);

        for (int i = list2.size() - 1; i >= 0; i--) {
            //인덱스를 증가시켜가면서 요소를 삭제하면 나머지 요소들이 한칸씩 앞으로 자리이동을 하게 됨
            //그렇게 하면 모든 요소를 훑어볼 수 없으므로 거꾸로 탐색함
            if(list1.contains(list2.get(i)))
                //list2.get(인덱스)의 반환형이 Object임
                //list1.contains(Objects) 매개변수가 배열의 요소이다
                list2.remove(i);
        }
        print(list1,list2);



    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();

    }
}
