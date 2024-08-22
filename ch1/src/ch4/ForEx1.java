package ch4;

public class ForEx1 {
    public static void main(String[] args) {
        // 반복문
        // for(가장 많이 사용), while, do~while
        // 안녕하세요 10번 출력

        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요.");
        }

        // 1) int i =0; 실행
        // 2)i < 10; 조건검사
        // 3)for 블럭 안 구문 실행 > System.out.println("안녕하세요.");
        // 4)i++ 실행 > i = 1
        // 5)i < 10; 조건검사
        // 6)for 블럭 안 구문 실행 > System.out.println("안녕하세요.");
        // 4) ~ 6) 반복 실행 i++ 실행 > i = 2
        // i = 10 된 후 조건검사 false가 되면 반복문 종료

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        // i+=2 == i=i+2
        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "\t");
        }

        System.out.println();

        // 홀수
        for (int i = 1; i < 11; i += 2) {
            System.out.print(i + "\t");
        }

        System.out.println();

        // 10 9 8 7 6 ~~~~
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "\t");
        }

        System.out.println();
    }

}
