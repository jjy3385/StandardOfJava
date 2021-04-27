package ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;// int * int 의 연산결과가 int임, 그래서 오버플로우가 발생
        // 그 후에 c 대입하면서 long으로 자동형변환되어도 값은 이미 계산 완료됨

        System.out.println(c);  //쌩뚱맞은 수가 출력됨
    }
}
