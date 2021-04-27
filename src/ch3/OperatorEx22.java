package ch3;

public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f; //저장 자체가 오차로 인해 0.10000000149011612 로 저장됨
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0==10.0f    %b%n",10.0==10.0f);
        System.out.printf("0.1==0.1f      %b%n",0.1==0.1f);
        System.out.printf("f = %19.17f%n",f);
        System.out.printf("d = %19.17f%n",d);
        System.out.printf("d2 = %19.17f%n",d2);
        System.out.printf("d==f %b%n",d==f);
        System.out.printf("d==d2 %b%n",d==d2);
        System.out.printf("d2==f %b%n",d2==f);
        System.out.printf("(float)d==f %b%n",(float)d==f);
        //double과 float 을 비교할 땐 double형 데이터를 float으로 명시적 형변환하고 비교해야함
        //double 0.1을 float으로 변환하면 0.10000000149011612 로 바뀌고 그 오차가 있는 값끼리 비교를 해야
        //0.1 == 0.1f 가 true 로 나올 수 있음음
   }
}
