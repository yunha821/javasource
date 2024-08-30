package api;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // System.in : 키보드
        Scanner sc = new Scanner(System.in);

        String[] argArr = null;
        while (true) {
            String promt = ">>";
            System.out.println(promt);

            // hello
            // hello 123
            String input = sc.nextLine();

            // 양쪽 공백 제거
            input = input.trim();

            // 문자열 분리 : 공백 기준
            // "공백+" : 공백이 최소 1 ~ 무한대
            // regex : 정규식
            argArr = input.split(" +");
            // System.out.println(Arrays.toString(argArr));

            // 소문자로 변경
            String cmd = argArr[0].toLowerCase();

            // q 이면 while문 종료
            if (cmd.equals("q")) {
                System.exit(0);
            } else {
                // q가 아니면 배열 출력
                for (String s : argArr) {
                    System.out.println(s);

                }
            }

        }
    }

}
