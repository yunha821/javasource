package classtest;

public class DataEx {
    public static void main(String[] args) {

        Data d = new Data();

        d.x = 10;
        System.out.println("main(d.x)");

        // change(d.x); 값 복사
        change(d); // 주소 복사
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

    }

    // static void change(int x) {
    // x = 10000;
    // System.out.println("change() : x = " + x);
    // } =>X 변경 안됨, 못 보냄

    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }
}
