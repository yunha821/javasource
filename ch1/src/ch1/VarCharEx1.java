package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자 : 홑따옴표로 처리
        char ch1 = 'c';
        // char ch2 = "c"; (X)

        char ch2 = 65; // 문자를 코드값으로 변경을 한 후 처리
        // 문자 표현방식
        // 아스키 코드, 유니 코드(인터넷에서 주로 사용되는 인코딩 방식)
        // ascii, utf-8, utf-16 .....
        // a == 97, A == 65
        System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
        System.out.printf("ch1 = %c, ch2 = %c", ch1, ch2);

    }

}
