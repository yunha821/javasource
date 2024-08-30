package api;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "Choi", "Kim", "Park" };

        String result = findKim(names);
        System.out.println(result);
    }

    static String findKim(String[] names) {
        // Kim 찾기
        int pos = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                pos = i;
                break;

            }

        }

        return "Kim은 " + (pos + 1) + "번째 위치에 있다.";
    }

}
