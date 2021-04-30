package ch5;

import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        //초기화를 시켜야 좌표처럼 보임, 그래서 수정함
        char[][] board =
        {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        byte[][] shipBoard =
                {
                        //1  2  3  4  5  6  7  8  9
                        {0, 0, 0, 0, 0, 0, 1, 0, 0},    // 1
                        {1, 1, 1, 1, 0, 0, 1, 0, 0},    // 2
                        {0, 0, 0, 0, 0, 0, 1, 0, 0},    // 3
                        {0, 0, 0, 0, 0, 0, 1, 0, 0},    // 4
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},    // 5
                        {1, 1, 0, 1, 0, 0, 0, 0, 0},    // 6
                        {0, 0, 0, 1, 0, 0, 0, 0, 0},    // 7
                        {0, 0, 0, 1, 0, 0, 0, 0, 0},    // 8
                        {0, 0, 0, 0, 0, 1, 1, 1, 0},    // 9
                };
        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input = scanner.nextLine();

            if (input.length() == 2) {
                x = input.charAt(0) - '0';//문자를 숫자로 변환(int보다 작은 자료형의 산술변환)
                y = input.charAt(1) - '0';

                if (x == 0 && y == 0)
                    break;

            }

            if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

            //공백표시가 안되서 좌표처럼 표시가 안됨...
            for (int i = 0; i < SIZE; i++)
                System.out.println(board[i]);
            System.out.println();

        }

    }
}
