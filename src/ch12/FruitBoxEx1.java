package ch12;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//        Box<Grape> grapeBox = new Box<Apple>(); 참조변수의 타입 매개변수가 일치해야함

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());  //Fruit의 자손을 메서드의 매개변수로 쓸 수 있음

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Toy()); 매개변수 타입 T를 Apple로 하여 선언한 appleBox에 toy객체를 담을 수 없음

        toyBox.add(new Toy());
//        toyBox.add(new Apple())

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }

}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}