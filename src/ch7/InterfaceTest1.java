package ch7;

class A1 {
    public void methodA(B1 b){
        b.methodB();
    }
}
class B1{
    public void methodB(){
        System.out.println("methodB()");
    }
}
public class InterfaceTest1 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.methodA(new B1());
    }
}
