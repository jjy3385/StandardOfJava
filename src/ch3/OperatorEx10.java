package ch3;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1_000_000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d%n",a,a,a,result1);
        //a * a 할 때 오버플로우 발생!!!
        System.out.printf("%d * %d / %d = %d%n",a,a,a,result2);
    }
}
