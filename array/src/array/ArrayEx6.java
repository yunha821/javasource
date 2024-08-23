package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기

        int max = scores[0];
        int min = scores[0];

        // for (int i = 1; i < scores.length; i++) {
        // if (max < scores[i]) {
        // max = scores[i];

        // }
        // if (min > scores[i]) {
        // min = scores[i];

        // }
        // }

        // 향상된 for 문
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score > min) {
                min = score;
            }
        }

        System.out.println("min : " + min + " max : " + max);

    }

}
