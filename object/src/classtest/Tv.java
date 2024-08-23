package classtest;

public class Tv {
    // 속성 => 변수
    // 채널 : 번호
    // 전원상태 : true(on)/false(off)
    // 제조사 : 삼성, LG

    private int channel; // private > Tv 클래스 이외의 클래스에서는 사용불가 > 생성자 생성
    private boolean power;
    private String company;

    // 생성자
    // 클래스 이름(){}
    // 생성자 오버로딩(하나의 클래스에 생성자가 여러개 존재)
    Tv() {
        // default 생성자 : () 안이 공백인 경우
    }

    Tv(int channel, boolean power, String company) {
        this.channel = channel;
        this.power = power;
        this.company = company;
    }

    // 전원을 켠다/끈다
    void power() {
        this.power = !this.power; // this 생략가능
    }

    // 채널 올린다/내린다
    void chaneelUp() {
        this.channel++;
    }

    void chaneelDown() {
        this.channel--;
    }

    // set 으로 시작하는 메소드는 setter 메소드 임

    // get 으로 시작하는 메소드는 getter 메소드 임 > 값을 밖으로 내보내는 역할
    public int getChannel() {
        // channel 값 보낼게
        return channel;
    }

    public String getCompany() {
        // company 값 보낼게
        return company;
    }

    public boolean isPower() {
        // power 값 보낼게
        return power;
    }

}
