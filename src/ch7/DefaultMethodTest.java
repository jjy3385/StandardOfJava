package ch7;

public class DefaultMethodTest {
    public static void main(String[] args) {

    }
}

class Child3 extends Parent3 implements MyInterface,MyInterface2{
    // 왜 이 method1() 메서드를 구현하지 않으면 컴파일 오류가 뜨는걸까?? **

    public void method1(){

    }
}
class Parent3{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}
interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}
