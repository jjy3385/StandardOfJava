package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;
public class MathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        out.println("round(" + val +") = " + round(val));

        val *= 100;
        out.println("round(" + val +") = " + round(val));

        out.println("round(" + val +")/100 = " + round(val)/100);
        out.println("round(" + val +")/100.0 = " + round(val)/100.0);
        out.println();
        out.printf("ceil(%3.1f)=%3.1f%n",1.1,ceil(1.1));
        out.printf("floor(%3.1f)=%3.1f%n",1.5,floor(1.5));
        out.printf("round(%3.1f)=%d%n",1.1,round(1.1));
        out.printf("round(%3.1f)=%d%n",1.5,round(1.5));
        out.printf("rint(%3.1f)=%f%n",1.5,rint(1.5));
        out.printf("round(%3.1f)=%d%n",-1.5,round(-1.5));   // -1
        out.printf("rint(%3.1f)=%f%n",-1.5,rint(-1.5));     // -2 , 두 정수의 가운데 있는 값은 가장 가까운 짝수 정수를 반환
        out.printf("ceil(%3.1f)=%3.1f%n",-1.5,ceil(-1.5));
        out.printf("floor(%3.1f)=%3.1f%n",-1.5,floor(-1.5));



    }

}
