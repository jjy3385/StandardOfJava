package ch11;

import java.util.*;

public class MyVector2Test {
    public static void main(String[] args) {
        MyVector2 v = new MyVector2();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("삭제 전 : " + v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();
        System.out.println("삭제 후 :" + v);
        //remove하면 lastRet은 -1 이 됨 => 현재 읽어온 값이 없다
        //remove하면 cursor는 cursor-- 됨, 현재 읽어온 값이 사라지면서
        //다음 위치를 가르키는 cursor 가 1줄어들어야 요소를 가르치게 됨(한자리씩 당겨지기 때문)

    }
}
