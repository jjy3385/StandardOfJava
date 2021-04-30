package ch5;

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse =
                {
                        ".-","-...","-.-.","-..","."
                        ,"..-.","--.","....","..",".---"
                        ,"-.-",".-..","--","-.","---"
                        ,".--.","--.-",".-.","...","-"
                        ,"..-","...-",".--","-..-","-.--"
                        ,"--.."

                };
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];    //morse의 인덱스 = charAt(인덱스) - 'A'(65)

        }
        System.out.println("source:" + source);
        System.out.println("morse:" + result);
    }
}
