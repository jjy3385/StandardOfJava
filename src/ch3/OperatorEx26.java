package ch3;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n",a,b);
        System.out.printf("a!=0 || ++b!=0 = %b%n",a!=0 || ++b!=0);
        //a!=0 는 참이므로 || 이후는 평가하지 않는다. 따라서 b는 계속 0
        System.out.printf("a=%d, b=%d%n",a,b);
        System.out.printf("a==0 && ++b!=0 = %b%n",a==0 && ++b!=0);
        //a==0 이 거짓이므로 && 이후는 평가하지 않는다. 따라서 b는 계속 0
        System.out.printf("a=%d, b=%d%n",a,b);
    }
}
