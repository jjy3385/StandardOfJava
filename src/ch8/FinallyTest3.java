package ch8;

public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1()의 수행을 마치고 main메서드로 돌아옴");
    }
    static void method1(){
        try{
            System.out.println("method1() 이 호출되었습니다.");
            return;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("method1() 의 finally블럭이 실행되었습니다.");
            //try에서 return해도 finally는 수행됨
        }

    }
}
