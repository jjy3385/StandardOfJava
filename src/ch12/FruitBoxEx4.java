package ch12;

import java.lang.reflect.Array;
import java.util.*;

class Fruit4 {
    String name;
    int weight;

    Fruit4(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple4 extends Fruit4 {
    Apple4(String name, int weight) {
        super(name, weight);
    }
}

class Grape4 extends Fruit4 {
    Grape4(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple4> {
    public int compare(Apple4 t1, Apple4 t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape4> {
    public int compare(Grape4 t1, Grape4 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit4> {
    public int compare(Fruit4 t1, Fruit4 t2) {
        return t2.weight - t1.weight;
    }
}


public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox4<Apple4> appleBox = new FruitBox4<Apple4>();
        FruitBox4<Grape4> grapeBox = new FruitBox4<Grape4>();

        appleBox.add(new Apple4("greenApple",300));
        appleBox.add(new Apple4("greenApple",100));
        appleBox.add(new Apple4("greenApple",200));

        grapeBox.add(new Grape4("greenGrape",400));
        grapeBox.add(new Grape4("greenGrape",300));
        grapeBox.add(new Grape4("greenGrape",200));

        Collections.sort(appleBox.getList(),new AppleComp());
        Collections.sort(grapeBox.getList(),new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();
        Collections.sort(appleBox.getList(),new FruitComp());
        Collections.sort(grapeBox.getList(),new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);




    }

}

class FruitBox4<T extends Fruit4> extends Box4<T> {

}

class Box4<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}