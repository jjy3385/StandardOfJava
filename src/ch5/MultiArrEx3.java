package ch5;

import sun.nio.cs.ext.MS932_0213;

public class MultiArrEx3 {
    public static void main(String[] args) {
        int[][] m1 =
                {
                        {1,2,3},
                        {4,5,6}
                };
        int[][] m2 =
                {
                        {1,2},
                        {3,4},
                        {5,6}
                };

        final int ROW = m1.length;      // 좌측행렬의 행 = 몫 행렬의 행
        final int COL = m2[0].length;   // 우측행렬의 열 = 몫 행렬의 열
        final int M2_ROW = m2.length;   // 우측행렬의 행 = 행렬 요소 구할 때 더해지는 횟수

        int[][] m3 = new int[ROW][COL];

        //행렬곱 m1 * m2 의 결과를 m3에 저장...3중for문
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL ; j++) {
                for (int k = 0; k < M2_ROW; k++) {
                    /*
                    m3[i][j] = m1[i][0] * m2[0][j]
                             + m1[i][1] * m2[1][j]
                             + m1[i][2] * m2[2][j]
                    * */
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        //행렬 m3를 출력
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3d",m3[i][j]);
            }
            System.out.println();
        }

    }
}
