package ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while(i--!=0){//후위 증감연산자이므로 조건식을 평가한 후에 i의 i--한다.
            System.out.println(i);
            //for(int j=0;j<2_000_000_000;j++)  ;안붙여서 오류남
            //for(int j=0;j<2_000_000_000;j++);
            for(int j=0;j<2_000_000_000;j++){}  //{}안에 아무것도 안 넣어도 됨


        }

        System.out.println("GAME OVER");
    }
}
