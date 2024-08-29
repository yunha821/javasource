package poly;

public class Driver {
    void drive(Vehicle v) {
        // DriverEx.java 에서 driver.drive(new Bus()) 코드 읽으면
        // Vehicle v = new Bus(); 의미
        // v 가 접근할 수 있는 범위 제한 > Bus bus = new Bus(); 와 다르다
        // 상속 시 메소드 오버라이딩을 하면 부모 메소드는 가려지고 자식 메소드만 실행됨
        // 상속관계가 있을 때 부모로 받을 수 있다 > 오버라이딩 되어있으면 결과 다양하게 받을 수 있음
        v.run();

    }

}
