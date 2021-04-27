package ch3;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;     //1_000_000를 자동으로 int로 해석하여 오버플로우 발생
        long b = 1_000_000 * 1_000_000L;    //1_000_000L 는 long 이므로 int * long 이 long으로 자동형변환됨

        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
