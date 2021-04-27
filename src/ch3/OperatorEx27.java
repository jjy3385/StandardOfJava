package ch3;

public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;

        System.out.printf("b=%b%n",b);
        System.out.printf("!b=%b%n",!b);
        System.out.printf("!!b=%b%n",!!b);      //!(!b)
        System.out.printf("!!!b=%b%n",!!!b);    //!(!(!b))

    }
}
