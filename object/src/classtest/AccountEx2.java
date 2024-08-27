package classtest;

import java.util.Scanner;
import java.util.Arrays;

public class AccountEx2 {

    // 멤버 변수 선언 가능
    // 유효 범위 때문에 > main 클래스, createAcoount 클래스, accountList 클래스 등등에서 사용하려고
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("=================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("=================================");
            System.out.println("메뉴 선택 >> ");

            // 멤버 변수에 static 안붙인 경우 nextInt()사용불가
            // why? 인스턴스 변수와 클래스 변수 생성 시기 다르기 때문
            // 멤버변수를 static 으로 만들어 준다
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    createAccount();
                    break;
                case 2:
                    // 계좌 목록 메소드 호출
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("메뉴 번호를 확인해주세요.");
                    break;
            }

        }

    }

    static void createAccount() {
        // 계좌 생성 담당 메소드
        // 계좌 관련된 정보 입력받기(계좌 번호, 이름, 금액)
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("이름 >> ");
        String owner = sc.nextLine();
        System.out.println("금액 >> ");
        int balance = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 빈 공간을 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.println("계좌생성이 완료되었습니다.");
                break;
            }
        }
    }

    static void accountList() {
        // 현재 생성된 계좌 목록 출력
        // accounts 배열 출력

        // 잘못 짠 코드
        // for (int i = 0; i < accounts.length; i++) {
        // if (accounts[i] != null) {
        // System.out.println(Arrays.toString(accounts[i]));
        // 위 코드 잘못된 이유
        // [i]는 주소를 가르키기 때문에 . 찍고 주소에 있는 값으로 접근해야 한다
        // System.out.println(accounts[i].getAccountNo());
        // System.out.println(accounts[i].getOwner());
        // System.out.println(accounts[i].getBalance());
        // 로 수정해야함
        // System.out.println("계좌 목록 출력이 완료되었습니다.");
        // break;
        // }
        // }

        System.out.println("=============================");
        System.out.println("계좌         이름        잔액");
        System.out.println("=============================");

        for (Account account : accounts) {
            if (account != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAccountNo(), account.getOwner(), account.getBalance());
            }

        }

    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 예금액 입력받기
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("예금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열요소에서 일치하는 계좌번호를 찾기
        Account account = findAccount(accountNo);
        if (account != null) {
            account.deposit(amount);
        }

        // 찾은 account의 deposit() 호출

    }

    static void withdraw() {
        // 출금하기
        // 계좌번호와 출금액 입력받기
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("출금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열요소에서 일치하는 계좌번호를 찾기
        Account account = findAccount(accountNo);
        if (account != null) {
            account.withdraw(amount);
        }

        // 찾은 account의 withdraw() 호출
        // for (Account account : accounts) {
        // if (account != null) {
        // if (accountNo.equals(account.getAccountNo())) {
        // account.withdraw(amount);
        // break;
        // }
        // }

        // }

    }

    static Account findAccount(String accountNo) { // return 값 타입과 맞춰준다
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {
                    return account;
                }
            }

        }
        return null;

    }

}
