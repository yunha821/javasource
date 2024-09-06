package generics;

public class Fruit {
    // 클래스 여러개 작성 가능하나 public class는 하나여야 함

    @Override
    public String toString() {
        return "Fruit";
    }

}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }

}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }

}

class FruitBox<T extends Fruit> extends Box3<T> {

}

class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + "";
        }
        return new Juice(tmp);
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }

}
