package ch3;

public class ifEx {
    public static void main(String[] args) {
        // 조건문
        // ~~ 가 참이라면 ~~를 해주세요
        // 조건1 이 참이라면 문장1을 수행하고 조건2가 참이라면 문장2를 수행하기

        // if (조건식 && 조건식 $$ 조건식) {
        // 수행할 구문;
        // 수행할 구문;
        // 수행할 구문;
        // }

        int num = 50;
        // if(){} : {} 을 생략 가능한 경우는 수행할 구문이 하나의 행인 경우만 가능
        if (num < 100) {
            System.out.println("100보다 작다");
        }

        // 100보다 크다 or 100보다 작다 둘 중 하나 출력
        if (num < 100) {
            System.out.println("100보다 작다");

        } else {
            // if에서 사용된 조건이 아닌 나머지
            System.out.println("100보다 크거나 같다");
        }

        // 점수가 100~90 사이일 때 등급은 A입니다
        // 점수가 89~80 사이일 때 등급은 A입니다
        // 점수가 79~70 사이일 때 등급은 A입니다
        // 점수가 69~60 사이일 때 등급은 A입니다
        // 나머지 점수의 등급은 F입니다.
        int jumsu = 20;

        if (jumsu >= 90) {
            System.out.println("등급은 A입니다");
        } else if (jumsu >= 80) {
            System.out.println("등급은 B입니다");
        } else if (jumsu >= 70) {
            System.out.println("등급은 C입니다");
        } else if (jumsu >= 60) {
            System.out.println("등급은 D입니다");
        } else {
            System.out.println("등급은 F입니다");
        }

        // 중첩 가능
        // if (조건1) {
        // if (조건2) {

        // }
        // }
    }

}
