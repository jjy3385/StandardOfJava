package ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n","abc"=="abc");
        System.out.printf("str1==\"abc\" ? %b%n",str1=="abc");//이 경우엔 true를 반환하긴함...
        System.out.printf("str2==\"abc\" ? %b%n",str2=="abc");//내용은 같지만 서로 다른 객체라서 false 를 반환함
        System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n",str2.equals("abc"));//어쨋든 문자열비교엔 equals()를 사용하자
        System.out.printf("str2.equals(\"ABC\") ? %b%n",str1.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",str1.equalsIgnoreCase("ABC"));

    }
}
