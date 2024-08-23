package classtest;

public class Method {

    // mothod 작성

    // 리턴타입 메소드명(){}
    // 정수형(byte, short, int, long), 실수형(float, double), 논리형(boolean)
    // 문자형(char, String), 배열(타입[]), void

    int method1() {
        // void 형이 아닌 이상 무조건 return 값 있어야 함
        return 0;
    }

    double mothod2() {
        // 메소드 앞에 작성한 메소드 리턴타입과 동일한 리턴타입의 값
        return 12.4;
    }

    char method3() {
        return 'a';
    }

    String method4() {
        return "abc";
    }

    int[] method5() {
        return new int[] { 1, 2, 3 };
    }

    void method6() {
        // void는 아무것도 안보냄
        return; // return; 조차 작성 안해도 됨
    }

}
