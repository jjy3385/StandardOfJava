package ch3;

public class OperatorEx30 {
    public static void main(String[] args) {
        int dec = 8;

        System.out.printf("%d >> %d  = %4d \t%s%n",dec,0,dec>>0,toBinaryString(dec>>0));
        System.out.printf("%d >> %d  = %4d \t%s%n",dec,1,dec>>1,toBinaryString(dec>>1));
        System.out.printf("%d >> %d  = %4d \t%s%n",dec,2,dec>>2,toBinaryString(dec>>2));

        System.out.printf("%d << %d  = %4d \t%s%n",dec,0,dec<<0,toBinaryString(dec<<0));
        System.out.printf("%d << %d  = %4d \t%s%n",dec,1,dec<<1,toBinaryString(dec<<1));
        System.out.printf("%d << %d  = %4d \t%s%n",dec,2,dec<<2,toBinaryString(dec<<2));
        System.out.println();

        dec = -8;
        //음수는 왼쪽끝부터 0이 아닌 1을 채우고 있음
        //음수 이진패턴에서는 양수와 반대로 0이 있음이고 1이 없음의 개념인듯
        //이게 음수의 이진패턴을 2의보수법을 적용하였기 때문에 이렇게 된 것으로 보임
        //약간 흐릿한 이해가 되고 있음 추가적인 정리가 필요함
        System.out.printf("%d >> %d  = %4d \t%s%n",dec,0,dec>>0,toBinaryString(dec>>0));
        System.out.printf("%d >> %d  = %4d \t%s%n",dec,1,dec>>1,toBinaryString(dec>>1));
        System.out.printf("%d >> %d  = %4d \t%s%n",dec,2,dec>>2,toBinaryString(dec>>2));

        System.out.printf("%d << %d  = %4d \t%s%n",dec,0,dec<<0,toBinaryString(dec<<0));
        System.out.printf("%d << %d  = %4d \t%s%n",dec,1,dec<<1,toBinaryString(dec<<1));
        System.out.printf("%d << %d  = %4d \t%s%n",dec,2,dec<<2,toBinaryString(dec<<2));
        System.out.println();

    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);//이 함수에 대한 설명은 생략됐다고 하지만...
    }

}
