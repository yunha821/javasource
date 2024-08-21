package ch2;

public class OperEx2 {
    public static void main(String[] args) {
        // 단항연산자
        // 1) 부호 연산자 : -, + (음수, 양수)
        // 2) 증감 연산자 : --, ++
        // --, ++ 앞 쪽에 오는 경우는 연산이 먼저 실행되고 대입이 됨
        // --, ++ 뒤 쪽에 오는 경우는 대입이 먼저 되고, 나중에 연산이 실행
        // 단, 독립적인 한의 문장으로 사용되는 경우에는 전위나 후위나 동일한 결과
        // 3) 논리 부정 연산자 : !
        // true, false 랑 사용

        int x = 10;
        // x++; // x = x + 1;
        // ++x;
        // System.out.println("x = " + x);
        // System.out.println("x = " + (++x)); // 11
        System.out.println("x = " + (x++)); // 10

        // x--; // x = x - 1;
        // --x;
        // System.out.println("x = " + x);
        // System.out.println("x = " + (--x)); // 10
        System.out.println("x = " + (x--));

        boolean play = true;
        System.out.println(!play);

    }

}
