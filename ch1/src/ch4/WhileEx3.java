package ch4;

public class WhileEx3 {
    public static void main(String[] args) {

        // 주사위 2개를 굴려 두 개의 합이 5와 같으면 반복문 종료
        // (2, 2), (1, 3)

        // random 1 ~ 6
        // System.out.println((int) Math.random() * 6);

        while (true) {
            int random1 = (int) (Math.random() * 6) + 1;
            int random2 = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)\n", random1, random2);
            if (random1 + random2 == 5) {

                break;

            }

        }

    }
}