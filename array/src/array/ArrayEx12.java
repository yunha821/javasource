package array;

import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 5 명의 학생들의 점수를 입력받아서 최고점수, 평균 출력

        // 5 라는 숫자는 변경될 수 있으므로 동적으로 생성
        // 입력받은 숫자를 기반으로 동적 배열 생성

        int scores[];

        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하시오.");
        int jumsu = sc.nextInt();

        scores = new int[jumsu];

        // 점수 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d 번 점수 입력 >>", (i + 1));
            scores[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(scores));

        // 최고 점수 구하기
        int max = scores[0];
        // 평균
        int sum = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }

        System.out.println("최고 점수 : " + max);
        System.out.println("평균 : " + sum / scores.length);

        sc.close();

    }

}
