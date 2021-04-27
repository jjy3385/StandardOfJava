package ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        /*
        수행순서
        (pi * 1000) => 3141.592f
        (int)3141.592f => 3141  (소수점 이하가 버려짐)
        3141/1000f => 3.141f
        * */
        System.out.println(shortPi);
    }
}
