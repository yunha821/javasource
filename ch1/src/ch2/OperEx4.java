package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {

        // 사용자로부터 한 달 월급을 입력받은 후 월급을 10년간 저축한 금액은 얼마인지 출력

        // Scanner scan = new Scanner(System.in);

        // System.out.println("한 달 월급을 입력해주세요.");

        // int num = scan.nextInt();
        // System.out.printf("10년간 저축한 금액은 %d\n", num * 12 * 10);

        // can.close();

        // 강사님 풀이
        Scanner scan = new Scanner(System.in);

        System.out.print("한 달 급여 입력 >>");

        // 급여를 변수에 담기
        int salary = scan.nextInt();

        // 저축 금액 구하기
        int deposit = salary * 12 * 10;

        System.out.printf("한 달 월급 :  %d, 10년 저축금액 : %d\n", salary, deposit);

        scan.close();
    }
}
