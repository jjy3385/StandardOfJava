package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        out.println("i =" + i);
        //int.MAX_VAULE = 2147483647 이므로 -i는 int 범위를 벗어난다
        out.println("-i=" + (-i));  //오버플로우가 발생하여 값이 바뀌지 않은것을 확인할 수 있음

        try{
            out.printf("negateExact(%d) = %d%n",10,negateExact(10));
            out.printf("negateExact(%d) = %d%n",-10,negateExact(-10));
            out.printf("negateExact(%d) = %d%n",i,negateExact(i));
        }catch (ArithmeticException e){
            out.printf("negateExact(%d)= %d%n",(long)i,negateExact((long)i));
        }

    }
}
