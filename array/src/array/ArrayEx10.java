package array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원 단어 맞추기
        String[] words = { "televison", "computer", "mouse", "phone" };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int pos = (int) (Math.random() * question.length);

                char tmp = question[j];
                question[j] = question[pos];
                question[pos] = tmp;
            }
            System.out.printf("Q%d) %s의 원래 단어는 무엇일까요?", i + 1, new String(question));

            // 답변 입력
            // 사용자의 답변이 원래 단어와 일치하는지 확인 후 정답입니다 or 틀렸습니다 출력
            String answer = sc.nextLine();

            if (answer.equals(words[i])) { // .equlas!!!!! 문자 비교!!!
                System.out.println("정답입니다.");

            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }

}
