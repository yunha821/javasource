package api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력하세요.");
        // String str = sc.next(); // 안녕하세요 반갑습니다 ==> nextLIne()
        // System.out.println(str); // 안녕하세요

        System.out.print("input num1 ");
        int num1 = sc.nextInt(); // 5 엔터 int num1 = Integer.parseInt(sc.nextLine())
        System.out.print("+-/* 중 하나를 입력하세요.");
        String op = sc.nextLine();
        // String op = sc.nextLine(); // 5 이후의 남은 엔터를 읽어들임
        System.out.print("input num2 ");
        int num2 = sc.nextInt();

    }

}
