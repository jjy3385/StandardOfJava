package ch5;
/*버블정렬
j번째 요소와 j+1 번째 요소 딱 두개만 비교해서 자리를 바꿈
5번부터 1번까지 역순으로 정렬된 카드 5장을 정렬한다고 생각해자
5번카드가 5번째 자리로 가기 위해 총 4번 자리바꿈이 필요하고 4번카드가 4번째 자리로 가기 위해 3번의 자리바꿈이 필요하다
그러므로 안쪽 for문의 반복횟수는 numArr.length - 1 - i
그리고 모든 카드에 대해 위와 같은 처리를 해야하는데 2번카드까지 제자리를 찾으면 1번카드는 자리바꿈을 할 필요가 없으므로
바깥쪽 for문의 반복횟수는 numArr.length - 1

이중for문으로 구성되어 비효율적이지만 가장 간단함
*/
public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }

            }
            if (!changed) break;

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
