package poly;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스 참조
        // 상속관계일 때
        // 부모타입(왼쪽) = 자식타입(오른쪽)
        Parent parent2 = new Child();

        // 차이점: child, parent2 변수가 접근할 수 있는 범위가 다름
        // child가 접근할 수 있는 메소드, 변수
        System.out.println(child.age + " " + child.name);
        child.play();
        child.print();
        // parent2가 접근할 수 있는 메소드, 변수
        System.out.println(parent2.age);
        parent2.print();

    }

}
