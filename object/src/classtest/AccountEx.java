package classtest;

public class AccountEx {
    public static void main(String[] args) {
        Account ac = new Account("101-11-12345", "홍길동", 0);

        // 예금하다
        ac.deposit(100000);

        // 잔액조회
        System.out.println("입금 후 현재 잔액 : " + ac.getBalance());

        // 출금하다
        int balance = ac.withdraw(50000);
        if (balance == -1) {
            System.out.println("잔액 부족");
        }
        System.out.println("출금 후 현재 잔액 : " + balance);

        printAccount(ac);
    }

    static void printAccount(Account ac) {

    }

}
