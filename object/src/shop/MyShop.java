package shop;

import static java.lang.Math.ulp;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    Scanner sc = new Scanner(System.in);

    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product products[] = new Product[5];

    // cart 생성
    Product cart[] = new Product[10];

    // start() 메소드 안의 변수를 checkOut() 메소드에서 사용하기 위한 변수 선언
    // 선택된 user의 index 보관
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 users 배열 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);

    }

    @Override
    public void genProduct() {
        // CellPhone, SmartTv 5개 생성 후 products 배열 담기
        products[0] = new CellPhone("iphone 13", 1500000, "kt");
        products[1] = new CellPhone("갤럭시", 1200000, "skt");
        products[2] = new CellPhone("iphone 14pro", 1700000, "uplus");
        products[3] = new SmartTv("삼성 울트라 HD", 1800000, "4k");
        products[4] = new SmartTv("LG 스마트", 1800000, "1080p");

    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // =============================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // [X] 종료
        // 선택 >>

        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("=========================================");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d] %s(%s)\n", (i + 1), users[i].getName(), users[i].getPayType());
        }
        System.out.println("[X] 종료");
        System.out.print("선택 >> ");

        // 사용자 입력 : 1,2,X
        // 사용자 입력이 1,2 인 경우 productList() 호출
        // X인 경우 : System.exit(0)

        String input = sc.nextLine();

        // 내 코드
        // if (input.equals("1") | input.equals("2")) {
        // productList();

        // } else {
        // System.exit(0);
        // }

        // 강사님 코드
        switch (input) {
            case "1":
            case "2":
                // 배열 인덱스와 동일하도록 -1
                selUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "X":
            case "x":
                System.exit(0);
                break;
            default:
                System.out.println("입력을 확인해 주세요.");
                start();
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // =============================
        // [1] iphone 13
        // [2] 갤럭시
        // [3] iphone 14pro
        // [4] 삼성 울트라 HD
        // [5] LG 스마트
        // [h] 메인화면
        // [c] 체크아웃
        // 선택 >>
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("=========================================");
        // 내코드
        // for (int i = 0; i < products.length; i++) {
        // System.out.printf("[%d] %s\n", (i + 1), products[i].getpName());

        // }

        // 강사님 코드
        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.print("선택 >> ");

        // 메뉴 받기
        String input = sc.nextLine();

        // 0~4 or h or c
        // h : 메인화면 - 계정선택 호출
        // c : checkOut() 호출
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // 0 ~ 4 : cart()에 담기
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = products[Integer.parseInt(input)];
                        break;
                    }
                }
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                break;
        }

    }

    public void checkOut() {
        // cart 화면 출력
        System.out.println(title + "-" + users[selUser].getName() + ": 체크아웃");
        System.out.println("=========================================");

        int i = 0;
        int sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getpName(), product.getPrice());
                sum += product.getPrice();
            }

        }

        // 결제방법 : CARD or CASH
        System.out.println("결제 방법 : " + users[selUser].getPayType());

        // 합계 : 카트에 담긴 물건
        System.out.println("합계 : " + sum);

        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제완료");

        // 입력값에 따라
        String input = sc.nextLine();
        // p : 상품목록 화면 보여주기
        switch (input) {
            case "p":
                productList();
                break;
            // q: 종료
            case "q":
                System.exit(0);
                break;
            default:
                System.out.println("입력 값을 확인해 주세요.");
                checkOut();
                break;
        }

    }

}
