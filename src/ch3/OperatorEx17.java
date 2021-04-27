package ch3;

public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) /1000.0;
        /*
        반올림하기 실행순서
        pi * 1000 => 3141.592
        3141.592 + 0.5 = 3142.092
        (int)3142.092 => 3142
        3142/1000.0 => 3.142 ( 1000.0 으로 나눠야 double/double => double이 됨, 1000으로 나누면 3이 나옴)
        * */
        System.out.println(shortPi);
    }
}
