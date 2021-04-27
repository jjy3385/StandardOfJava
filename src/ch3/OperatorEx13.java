package ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
        //char c2 = c1 + 1; //컴파일 에러 발생 : char형변환 필요
        char c2 = 'a' + 1;  //상수,리터럴 간의 연산은 컴파일러가 미리 연산을 다 해놓는다

        final char c3 = 'b';
        char c4 = c3 + 1;   //상수형 변수를 쓸 때도 컴파일러가 미리 연산을 해놓는다

        System.out.println(c2);
        System.out.println(c4);
    }
}

