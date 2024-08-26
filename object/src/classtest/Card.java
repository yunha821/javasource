package classtest;

public class Card {
    // 멤버 변수
    private String kind; // heart, diamond....
    private int num;

    // 클래스 변수
    static int width = 100;
    static int height = 250;

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String getKind() {
        return kind;
    }

    public int getNum() {
        return num;
    }

}
