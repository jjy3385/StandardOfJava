package ch3;

public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;

        System.out.printf(" p   =%d \t%s%n",p,toBinaryString(p));
        System.out.printf(" ~p  =%d \t%s%n",~p,toBinaryString(~p));//비트전환한 값이 1의 보수
        System.out.printf(" ~p+1=%d \t%s%n",~p+1,toBinaryString(~p+1));//1의 보수 + 1 = 2의 보수 = 양수p의 음수값
        System.out.printf(" ~~p =%d \t%s%n",~~p,toBinaryString(~~p));
        System.out.println();
        System.out.printf("n=%d%n",n);
        System.out.printf("~(n-1)=%d%n",~(n-1));//음수n의 양수값


    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);//이 함수에 대한 설명은 생략됐다고 하지만...
    }
}


