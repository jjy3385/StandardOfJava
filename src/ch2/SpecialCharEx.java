package ch2;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');   //''' 안되고 \가 이스케이프 문자임
        System.out.println("abc\t123\b456"); //\b 가 backspace라 3이 지워짐
        System.out.println('\n');
        System.out.println("\"Hello\"");    //큰따옴표 출력을 위해 \를 " 앞에 붙임
        System.out.println("c:\\");         // 역슬래시(\)를 출력하려고 \를 하나 더 붙임
    }
}
