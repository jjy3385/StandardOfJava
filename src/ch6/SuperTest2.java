package ch6;

public class SuperTest2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
class Parent {
    int x = 10; //조상클래스에 선언된 멤버변수와 같은 이름의 멤버변수를 자손클래스에서 중복 정의할 수 있다
}

class Child extends Parent {
    int x = 20;
    void method(){
        System.out.println("x ="+x);
        System.out.println("this.x ="+this.x);
        System.out.println("super.x ="+super.x);
    }
}
