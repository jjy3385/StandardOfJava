package ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        System.out.print("숫자를 입력하세요.(예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum=%3d num=%d %3.2f %n", sum, num, (float)sum);
            //음 참고로 지시자 %d랑 %f 앞에 붙는 숫자의 의미가 서로 다른거 같음

            num /= 10;
        }
        System.out.println("각 자리수의 합:" + sum);
    }
}
