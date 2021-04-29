package ch4;

public class FlowEx33 {
    public static void main(String[] args) {

        Loop1 : for(int i=2;i<=9;i++){
            for(int j=1;j <=9;j++){
                if(j==5)
                    //break Loop1;      //2*4 까지만 출력디됨
                    //break;            //2~9단까지 i*4 까지만 출력됨
                    //continue Loop1;   //2~9단까지 i*4 까지만 출력됨
                    continue;         //2~9단까지 i*5만 출력되지 않음
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
