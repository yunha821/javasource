package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // 자동 형변환
        car = fe; // Car car = new FireEngine();
        // car.water();

        // 조상타입은 자손타입으로 강제 형변환
        fe2 = (FireEngine) car;
        fe2.water();

        Car car2 = new Car();
        // 처음에 부모로 생성된걸 자식으로 변환 불가능
        // Car car = new FireEngine(); 코드와 차이 있다
        // ClassCastException (실행시(런타임) 오류 발생) : instanceof 연산자
        if (car2 instanceof FireEngine) {
            fe = (FireEngine) car2;
            fe.drive();
        }

        if (car2 instanceof Car) {
        }
    }

}
