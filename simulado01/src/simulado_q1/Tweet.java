package simulado_q1;

public class Tweet {
    private String text;

    public Tweet(String text) {
        this.text = text;
    }

    public int getSize(){
        return text.length();
    }
    
}
