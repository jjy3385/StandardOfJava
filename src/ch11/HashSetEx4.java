package ch11;

import java.util.*;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David",10));
        set.add(new Person2("David",10));

        System.out.println(set);
    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person2) {
            Person2 tmp = (Person2) obj;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }

    public int hashCode() { //오버라이딩을 해야됨... 오버라이딩한 메서드면 인텔리제이에서는 노란색으로 바뀜
//        return (name + age).hashCode();
        return Objects.hash(name,age);
    }

    public String toString() {
        return name + ":" + age;
    }
}
