package modifier;

public class Card {
    // final field KIND may not have been initialized
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    Card(String kind, int num) {
        // final이 붙으면 초기화 무조건! 선언할 때 or 생성자에서!
        KIND = kind;
        NUMBER = num;

    }

    Card() {
        this("HEART", 2);

    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }

}
