package ch9;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = i;
        Object obj = (Object) i;

        Long lng = 100L;

        int i2 = intg + 10; //참조형 + 기본형
        long l = intg + lng;    //참조형 + 참조형

        Integer intg2 = new Integer(20);
        int i3 = (int) intg2;    //참조형을 기본형으로 형변환

        Integer intg3 = intg2 + i3;

        System.out.println("i = " + i);
        System.out.println("intg = " + intg);
        System.out.println("obj = " + obj);
        System.out.println("lng = " + lng);
        System.out.println("intg + 10 = " + i2);
        System.out.println("intg + lng = " + l);
        System.out.println("intg2 =" + intg2);
        System.out.println("i3 = " + i3);
        System.out.println("intg2 + i3 =" + intg3);


    }
}
