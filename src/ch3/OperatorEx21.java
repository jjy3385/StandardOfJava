package ch3;

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b%n",10 == 10.f);
        //왼쪽 피연산자 10을 10.0f 형변환하여 비교한다
        System.out.printf("'0' == 0 \t %b%n",'0' == 0);
        System.out.printf("'A' == 65 \t %b%n",'A' == 65);
        System.out.printf("'A' > 'B' \t %b%n",'A' > 'B');
        System.out.printf("'A'+1 != 'B' \t %b%n",'A'+1 != 'B');
    }
}
