package classtest;

public class GoodsStockEx {
    public static void main(String[] args) {

        // p1015(운동화)
        GoodsStock goods1 = new GoodsStock("p1015", 100);

        // p1015(양말)
        GoodsStock goods2 = new GoodsStock("p2001", 15);

        // 운동화 판매 => 재고 감소
        System.out.println("현재 운동화 재고 : " + goods1.subStock(5));

        // 양말 추가 입고 => 재고 추가

        // return 값 없어서 오류, stockNum은 private > get 메소드 생성하여 해결
        // System.out.println("현재 양말 재고 : " + goods2.addStock(20));

        System.out.println("현재 양말 재고 : " + goods2.getStockNum());

    }

}
