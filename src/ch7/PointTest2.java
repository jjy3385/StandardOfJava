package ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x" + p3.x);
        System.out.println("p3.x" + p3.y);
        System.out.println("p3.x" + p3.z);
    }
}

class PointTest {
    int x = 10;
    int y = 20;

    PointTest(int x ,int y){
        //컴파일러가 super(); 를 삽입함
        this.x = x;
        this.y = y;
    }
}

class Point3D extends PointTest{
    int z = 30;

    Point3D(){
        this(100,200,300);
    }

    Point3D(int x,int y,int z){
        super(x,y);
        this.z = z;
    }

}
