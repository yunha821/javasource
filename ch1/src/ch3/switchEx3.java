package ch3;

import java.util.Scanner;

public class switchEx3 {
    public static void main(String[] args) {
        // 가위(1) 바위(2) 보(3) 게임

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 숫자로 입력해주세요.");
        int user = sc.nextInt();

        // 3(컴) 보자기 / 2(유저) 바위

        switch (user - computer) {
            case 2:
            case -1:
                System.out.println("유저가 졌습니다.");

                break;
            case 1:
            case -2:
                System.out.println("유저가 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");

            default:
                break;
        }
    }

}
