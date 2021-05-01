package ch6;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    //참조형 매개변수를 활용하면 여러 개의 값을 반환받는 것 같은 효과를 내게 만들 수 있음
    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
