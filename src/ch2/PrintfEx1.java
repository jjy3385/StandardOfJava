package ch2;

public class PrintfEx1 {
    public static void main(String[] args) {
        //지시자 연습
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;

        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;
        //2,8,16진수를 넣었지만 int를 그냥 출력하면 10진수로 표시됨
        //다만 각각의 숫자가 prinf() 에서 지시자로 지정해주는 진수로 표현됨

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c);   // char 형의 경우 형변환없이 %d 지시자로 출력안됨
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x, %d%n", hex, hex); //# 빼면'0x' 표시안됨
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

    }
}
