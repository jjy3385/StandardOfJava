package ch9;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        //str1과 str2가 같은 객체를 참조하고 있으므로 == 와 equals 모두 참
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("\"abc\"");
        String str4 = new String("\"abc\"");

        //str3과 str4가 다른 객체를 참조하고 있지만 값은 같으므로 == 는 false equals 는 true
        //equals 의 경우,문자의 값만 비교하도록 오버라이딩 된 것임
        //Object.equals() 의 경우는 참조변수 주소값을 비교하고 있음
        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ?" + str3.equals(str4));

        System.out.println(((Object) str3).equals((Object)str4));
        //음??false 가 나와야되는거 아님??

    }
}
