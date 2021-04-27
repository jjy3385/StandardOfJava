package ch3;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i =5,j=5;
        System.out.println(i++);    //후위형은 대입(참조) 후 증가이므로 5
        System.out.println(++j);    //전위형은 대입(참조) 전 증가이므로 6
        System.out.println("i = " + i + ", j = " + j);

    }
}
