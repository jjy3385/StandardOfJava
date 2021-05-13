package ch9;

class Card {
    String kind;
    int number;

    Card(){
        this("SPADE",1);
    }
    Card(String kind,int number){
        this.kind = kind;
        this.number = number;
    }

    //toString() 을 오버라이딩하지 않으면 클래스명@16진수해쉬값이 출력됨
    public String toString(){
        return "kind : " + kind + ", number : " + number;
    }

}
public class CardToString2 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card("HEART",10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
