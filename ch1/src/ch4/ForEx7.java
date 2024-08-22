package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5! 출력
        // 5 * 4 * 3 * 2 * 1

        int fact = 1;

        // for (int i = 5; i > 0; i--) {
        // fact *= i;

        // }
        // System.out.printf("5! = %d", fact);

        // 특정 숫자의 factorial 구하기
        Scanner sc = new Scanner(System.in);

        System.out.print("팩토리얼을 구할 숫자 입력 >> ");

        // 숫자 입력 받기
        int input = sc.nextInt();

        // 입력 받은 숫자의 factorial 구한 후 출력

        for (int i = input; i > 0; i--) {
            fact *= i;

        }
        System.out.printf("%d! = %d", input, fact);

        sc.close();

    }

}
