package classtest;

public class TimeEx {
    public static void main(String[] args) {

        Time time = new Time();

        // 시 설정
        // time.hour = 100;

        // 메소드를 통해서 속성 변경 why? ex 잘못된 값 입력할 수 있기 때문..
        time.setHour(100);

    }

}
