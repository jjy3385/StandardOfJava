package ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100) {
            /*위의 표현식이 복잡해보이지만 사실은 깔끔하고 간단함
            1.i를 1씩 증가시키면서 sum에 누적함
            2.그 값이 100 이하일때까지만 실행
            */
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
