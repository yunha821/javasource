package classtest;

public class Student {
    // 속성 (무조건 private으로 만든다)
    private String number; // 학번 s12345678
    private String name; // 이름 홍길등
    private String address; // 주소 서울시 종로구
    private String mobile;// 핸드폰 010-1234-1234

    // 생성자
    // 클래스 이름(){}
    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를 자동으로 생성함
    // 생성자 목적 : 인스턴스 초기화 메서드
    // this : 자기자신
    // super : 부모

    // 생성자 오버로딩
    Student() {
    }

    public Student(String number) {
        this.number = number;
    }

    public Student(String number, String name) {
        // this.number = number;
        this(number);
        this.name = name;
    }

    public Student(String number, String name, String address) {
        // this.number = number;
        // this.name = name;
        // this.address = address;
        this(number, name);
        this.address = address;
    }

    public Student(String number, String name, String address, String mobile) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    // 메소드
    // 특정 작업을 수행하는 일련의 문장들을 하로 묶은 것
    // 재사용성, 중복된 코드 제거, 프로그램 구조 구조화

    // 리턴타입 메소드명(){}
    // 정수형, 실수형, 논리형, 문자형, 배, void
    public String getName() {
        return name;
    }

}
