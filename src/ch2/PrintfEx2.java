package ch2;


public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f; //0.10, 1.0e-1
        float f2 = 1e1f; //10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f; //3140.0
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f1=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d); //%f 는 기본적으로 소수점 6자리까지만 표시됨, 7자리에서 반올림
        System.out.printf("d=%14.10f%n", d); //전체자리수.소수점자리수 => 즉,이 경우 정수부는 4자리임

        System.out.printf("[1234578901234567890]%n");
        System.out.printf("[%s]%n", url);       //문자열 길이만큼 출력
        System.out.printf("[%20s]%n", url);     //20자리 확보,우측정렬
        System.out.printf("[%-20s]%n", url);    //20자리 확보,좌측정렬
        System.out.printf("[%.8s]%n", url);     //왼쪽에서 8글자만 출력


    }
}
