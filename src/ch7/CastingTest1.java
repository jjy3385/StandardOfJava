package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   //car = (Car)fe; 인데 형변환이 생략됨, 자손을 조상타입 참조변수에 넣는 경우(업캐스팅)임
//        car.water();
        fe2 = (FireEngine)car;  //자손타입 <- 조상타입 는 명시적 형변환
        fe2.water();
    }


}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop !!!");

    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
