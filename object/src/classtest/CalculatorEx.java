package classtest;

public class CalculatorEx {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // 메소드 호출 => 메소드 실행
        calculator.powerOn();

        // return 존재 시 1) 변수에 담기 2) 사용
        int result = calculator.plus(8, 6);
        System.out.println("연산 결과 : " + result);
        System.out.println("연산 결과 : " + calculator.plus(9, 8));

        // 나누기
        double divResult = calculator.divibe(9, 2);
        System.out.println("나눈 결과 : " + divResult);

        // System.out.println(calculator.powerOff());
        // void라면 호출만 가능
        calculator.powerOff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.excute();

    }

}
