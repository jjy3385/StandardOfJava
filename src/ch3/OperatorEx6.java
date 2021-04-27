package ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a+b; +연산자가 a,b를 int로 변환한 후 연산하기 때문에 a+b 으 자료형은 int
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}
