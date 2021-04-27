package ch2;

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float) i;
        int i2 = (int) f;

        double d = (double) i;
        int i3 = (int) d;

        float f2 = 1.666f;
        int i4 = (int) f2;

        System.out.printf("i=%d\n", i);
        System.out.printf("f=%f i2=%d\n", f, i2); //8자리 정수를 float으로 변환할 때, 오차가 발생함
        System.out.printf("d=%f i3=%d\n", d, i3); //8자리 정수를 double로 변환할 때, 오차가 발생하지 않음
        System.out.printf("(int)%f=%d\n", f2, i4); //float을 int로 변환할 때 소수점 이하 버림림


    }
}
