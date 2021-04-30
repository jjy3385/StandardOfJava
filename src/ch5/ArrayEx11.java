package ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);

        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;   //배열numArr[i] 의 값과 counter배열의 인덱스가 일치하는 요소의 값을 1증가시킨다

        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 :" + counter[i]);
        }
    }
}
