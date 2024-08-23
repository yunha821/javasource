package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // char[] 배열명 = {'a', 'b', 'c', 'd'}
        // 타입 배열명[]

        char[] chArr = { 'a', 'b', 'c', 'd' };

        // 확인 (화면 출력) > 대괄호 형태로만 출력 변경 불가
        System.out.println(Arrays.toString(chArr)); // [a, b, c, d]

        for (int i = 0; i < chArr.length; i++) {
            System.out.println(chArr[i] + "\t");
        }

        // 향상된 for문
        for (char c : chArr) {
            System.out.println(c + "\t");

        }

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        for (float f : flArr) {
            System.out.println(f + "\t");

        }

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };
        // (오류) ArrayIndexOutOfBoundsException
        // System.out.println(strArr[4]);

        for (String string : strArr) {
            System.out.println(string + "\t");

        }
    }

}
