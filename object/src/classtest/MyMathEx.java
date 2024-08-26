package classtest;

public class MyMathEx {
    public static void main(String[] args) {

        MyMath mymath = new MyMath();

        // 메소드 호출 후 결과 출력
        long addResult = mymath.add(5L, 8L);
        System.out.println("연산 결과 : " + addResult);

        long subtractResult = mymath.subtract(8L, 5L);
        System.out.println("연산 결과 : " + subtractResult);

        long multiplyResult = mymath.multiply(5L, 8L);
        System.out.println("연산 결과 : " + multiplyResult);

        double divibeResult = mymath.divide(5L, 0L);
        System.out.println("연산 결과 : " + divibeResult);

        int result5 = mymath.divide(5, 0);
        System.out.println(result5);

        MyMath2 math2 = new MyMath2(15, 5);
        // 인스턴스 메소드 사칙연산
        System.out.println(math2.add());
        System.out.println(math2.subtract());
        System.out.println(math2.multiply());
        System.out.println(math2.divide());

        // 클래스 메소드 사칙연산
        System.out.println(MyMath2.add(15, 5));
        System.out.println(MyMath2.subtract(15, 5));
        System.out.println(MyMath2.multiply(15, 5));
        System.out.println(MyMath2.divide(15, 5));
    }

}
