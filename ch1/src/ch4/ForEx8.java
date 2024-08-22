package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        // 이중 for 문
        // 4x + 5y = 60 을 만족하는 x, y 값 출력
        // x, y 는 10이하의 자연수

        int z = 0;

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {

                z = (4 * x) + (5 * y);
                if (z == 60) {
                    System.out.printf("%d, %d\n", x, y);

                }

            }

        }

        // 강사님 풀이
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {

                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }

}
