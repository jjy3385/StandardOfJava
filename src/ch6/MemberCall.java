package ch6;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;
    static int cv2 = new MemberCall().iv;
//    클래스 변수가 인스턴스 변수를 참조하기 위해선 인스턴스를 생성한 후에만 가능하다
//    다만 위와 같은 형태로 생성한 인스턴스는 참조변수가 없기 때문이 사용할 수 없다

    static void staticMethod1(){
        System.out.println(cv);
//        System.out.println(iv);
        System.out.println(new MemberCall().iv);
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
//        instanceMethod();
        new MemberCall().instanceMethod1();//객체 생성 후에만 인스턴스 메소드 호출 가능
    }

    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();
        //클래스메서도,인스턴스메서도 모두 호출 가능
    }



}
