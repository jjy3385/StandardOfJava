package ch7;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = "+p.x);
        p.method();
        System.out.println("c.x = "+c.x);
        c.method();

        //메소드 method()는 현재 인스턴스(Child2)의 메서드가 수행됨
        //멤버변수는 조상 참조변수인 p에선 조상 멤버변수, 자식 참조변수인 c에선 자식 멤버변수값으로 출력됨

    }
}

class Parent2 {
    int x = 100;
    void method(){
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}
