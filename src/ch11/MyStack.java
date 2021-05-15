package ch11;

import java.util.*;

public class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object Obj = peek();
        removeElementAt(size() - 1);
        return Obj;
    }

    public Object peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); //끝에서부터 객체를 찾음,스택에서 끝은 가장 먼저 입력된 객체의 인덱스를 말하는 것임
                                //그러므로 동일한 객체를 매개변수로 받았다면 그 중 가장 먼저 입력된 값의 인덱스를 찾은 후

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

}
