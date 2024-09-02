package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "dog", "lion", "tiger" };
        // T, E, K, V : 객체
        Arrays.sort(strArr, Comparator.reverseOrder());

        // int, char => Character, float => Float...
        Integer arr[] = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        // 내림차순
        // Arrays.sort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
