package generics;

public class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();

        box.setItem("홍길동");

        String str = (String) box.getItem();

        box.setItem(33); // new Integer(33)
        Integer i = (Integer) box.getItem();

        Box2<String> box2 = new Box2<>();
        box2.setItem("황윤하");
        str = box2.getItem();
        System.out.println(str);

        Box2<Integer> box3 = new Box2<>();
        box3.setItem(55);
        Integer str2 = box3.getItem();
        System.out.println(str2);

    }

}
