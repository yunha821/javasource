package poly;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);

        // computer 구입
        buyer.buy(new Computer());
        // 에어컨 구입
        buyer.buy(new Air());
    }

}
