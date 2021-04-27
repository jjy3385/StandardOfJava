package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j=0;

        j = i++;    //후위형은 j에 대입한 후 i의 값을 증가시킴
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

        i = 5;
        j=0;
        j=++i;  //전위형은 값을 증가시키고 j에 대입
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
        //전위형은 증가 후 대입/ 후위형은 대입 후 증가

    }
}
