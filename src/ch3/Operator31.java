package ch3;

public class Operator31 {
    public static void main(String[] args) {
        int dec = 1234;
        int hex = 0xABCD;
        int mask = 0xF; //0x000F;

        System.out.printf("hex=%X%n",hex);
        System.out.printf("%X%n",hex & mask);
        //비트AND연산자는 두 bit가 모두 1일때만 1이 됨 , 따라서 위의 연산결과가 0x000D

        hex = hex >> 4;
        //비트 4칸 오른쪽 이동(16진수 한자리), 연산결과는 0ABC;
        System.out.printf("%X%n",hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n",hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n",hex & mask);
    }
}
