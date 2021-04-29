package ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.printf("i=%d",i);

            int tmp = i;

            do{
                if(tmp%10%3==0 && tmp%10!=0)//tmp%10 이 3의 배수인지 확인(예를 들면 tmp = 13 이면 tmp%10 = 3임)
                    System.out.print("짝");
            }while((tmp/=10)!=0);
            //tmp = tmp/10, 3,6,9 게임할 때 33은 박수 두번 쳐야되는데 첫번째,두번째 수가 모두 3,6,9를 포함하고 있기 때문임
            //그걸 적용한 것임

            System.out.println();
        }


    }
}
