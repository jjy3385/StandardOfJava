package ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i =0; i<ball.length;i++){
            ball[i] = i+1;
        }

        int temp = 0;
        int j = 0;

        for(int i  =0; i<6;i++){
            j = (int)(Math.random() * 45);
            temp  = ball[i];
            ball[i] = ball[j];
            ball[j] = temp; //같은 j가 나와도 중복되지 않도록 하기 위해 이번에 뽑힌 값과 바꿔줌
        }

        for(int i = 0;i<6;i++){
            System.out.printf("ball[%d]=%d%n", i,ball[i]);
        }
    }
}
