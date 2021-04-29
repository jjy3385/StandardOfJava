package ch3;

import java.net.Inet4Address;

public class OperatorEx28 {
    public static void main(String[] args) {
        //비트연산자 예제
        int x = 0xAB, y = 0xF;

        System.out.printf("x = %#X\t\t%s%n",x,toBinaryString(x));
        System.out.printf("y = %#X\t\t%s%n",y,toBinaryString(y));
        System.out.printf("%#X | %#X = %#X\t%s%n",x,y,x|y,toBinaryString(x|y)); //마지막 4자리가 변경됨
        System.out.printf("%#X & %#X = %#X\t%s%n",x,y,x&y,toBinaryString(x&y)); //마지막 4자리만 뽑아냄
        System.out.printf("%#X ^ %#X = %#X\t%s%n",x,y,x^y,toBinaryString(x^y)); //마지막 4자리가 변경됨
        System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n",x,y,y,x^y^y,toBinaryString(x^y^y));  //다시 원래대로 돌아옴

    }

    static String toBinaryString(int x){

        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);

        return tmp.substring(tmp.length()-32);//이 함수에 대한 설명은 생략됐다고 하지만...
        //zero + int x의 이진패턴(예제에서 보면 y = 0xF; 인데 0xF는 int 15이고 이진수로는 000...001111)  =
        //00000000000000000000000000000000 + 00000000000000000000000000001111
        //tmp.substring(x) 는 문자열의 x번째 인덱스 이후값만 가져오라는 뜻

    }
}
