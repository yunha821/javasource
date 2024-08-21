package ch3;

import java.util.Scanner;

public class ifEx5 {
    public static void main(String[] args) {
        // 근무 시간에 따른 임금 계산
        // 근무 시간 입력 받기
        // 8 시간까지 시간당 기본임금(10000) 제공
        // 초과근무시간은 시간당 기본임금 1.5배 제공

        // 강사님 풀이
        int rate = 10000, pay = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("근무 시간을 입력해주세요.");

        int hours = sc.nextInt();

        if (hours > 8) {
            pay = (int) (rate * 8 + (rate * (hours - 8) * 1.5));
        } else {
            pay = rate * hours;
        }

        System.out.printf("근무시간 : %d, 임금 : %d\n", hours, pay);

        sc.close();

        // int pay = 10000;

        // Scanner sc = new Scanner(System.in);

        // System.out.println("근무 시간을 입력해주세요.");

        // int time = sc.nextInt();

        // if (time <= 8) {
        // System.out.println(time * pay);
        // } else
        // System.out.println(time * (pay * 1.5));

        // sc.close();
    }
}
