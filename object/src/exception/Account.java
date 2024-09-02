package exception;

public class Account {
    private String accountNo;// 계좌번호(accountNo) : 101-11-12345
    private String owner;// 계좌주(owner) : 홍길동
    private int balance;// 잔액(balance) : 1000000

    public Account(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금하다(deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴 없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int amount) {
        if (amount > balance) {
            // throw new Exception("잔액 부족");
            throw new RuntimeException("잔액 부족");
        }
        balance -= amount;
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public static void diposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diposit'");
    }

}
