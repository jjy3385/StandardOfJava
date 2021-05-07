package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        Car car = new Car();

        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine instance");
        }
        if(fe instanceof Car){
            System.out.println("This is a Car instance");
        }
        if(fe instanceof Object){
            System.out.println("This is an Object instance");
        }
        if(!(car instanceof FireEngine)){
            System.out.println("Car is not a FireEngine instance");
        }
        System.out.println(fe.getClass().getName());
    }
}
