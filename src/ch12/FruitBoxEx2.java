package ch12;

import java.util.ArrayList;

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit2";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple2";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape2";
    }
}

class Toy2 {
    public String toString() {
        return "Toy2";
    }
}

interface Eatable {
}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
//        FruitBox2<Grape2> grape2Box = new FruitBox2<Apple2>();
//        FruitBox2<Toy2> toyBox = new FruitBox2<Toy2>(); FruitBox2 타입 매개변수에 extends 붙여서 오류나는것임

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
//        appleBox.add(new Grape2()); Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape2());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }
}

class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {
}

class Box2<T> {
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