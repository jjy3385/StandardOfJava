package ch6;

class CaptionTv extends  Tv {
    boolean caption;
    void dispalyCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.dispalyCaption("Hello, World");
        ctv.caption = true;
        ctv.dispalyCaption("Hello, World");
    }
}
