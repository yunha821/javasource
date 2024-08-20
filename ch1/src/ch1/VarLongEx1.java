package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // L, l : 대소문자 둘 다 가능(생략 가능)
        long value = 123456789L;
        System.out.println(value);
        // print() 메소드 안의 +의 의미는 연결 : "" 랑 같이 있을 때
        System.out.println("value = " + value);
        // 산술 연산
        System.out.println(value + value);
    }

}
