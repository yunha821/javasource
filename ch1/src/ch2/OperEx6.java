package ch2;

public class OperEx6 {
    public static void main(String[] args) {

        // 논리 연산자 : &&(and), ||(or), !(not)
        // true && true, true || true ==> 결과가 true
        // true && flase => 결과는 false
        // true || false => 결과는 true
        // &&(and) : 모든 조건이 true인 경우만 true
        // true && false && true : false가 속해 있는 경우 다음 조건은 검사하지 않음
        // true || false || true : 처음 조건이 true 라면 다음 조건은 검사하지 않음

        int value = 6;

        // value가 2의 배수 혹은 3의 배수인지 확인한 후 맞다면
        // 2 또는 3의 배수라고 출력하기

        // System.out.println((value % 2 == 0) || (value % 3 == 0));
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");

        }

        char ch1 = 'A';
        System.out.println(ch1 >= 'A');
        System.out.println(ch1 >= 'Z');

        // ch1 이 대문자라면 ch1 은 대문자입다라 출력
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("ch1은 대문자입니다");
        }
    }

}
