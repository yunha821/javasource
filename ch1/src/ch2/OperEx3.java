package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명당 몇 개를
        // 나눠가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        // 조건 ) 변수 사용

        int x = 534;
        int y = 30;
        System.out.println(x / y);
        System.out.println(x % y);

        // 강사님 풀이
        int pensil = 534, student = 30;
        System.out.printf("학생 한 명당 %d 자루\n", (pensil / student));
        System.out.printf("남은 연필 %d 자루\n", (pensil % student));

        // 사다리꼴의 넓이 구하기
        // 윗변 : 5, 아랫변: 10, 높이: 7
        // 조건 ) 변수 사용, 소수 자리 수까지 출력

        int q = 5, r = 10, s = 7;
        System.out.println((5 + 10) * 7 / 2);

        // 강사님 풀이
        int top = 5, bottom = 10, height = 7;
        double result = (top + bottom) * height / 2;
        // 52.5 나오고 싶으면 왼쪽 식에서 하나라도 double 형으로 바꿔야 한다 ex /2.0, 형변환
        double result2 = (double) (top + bottom) * height / 2;
        System.out.printf("사다리꼴 넓이 %f\n", result); // 52.000000
        System.out.printf("사다리꼴 넓이 %f\n", result2); // 52.500000
        System.out.printf("사다리꼴 넓이 %.1f\n", result2); // .1f > 소수점 첫째 자리까지

        // 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구한 후 출력
        // 예를 들어 24라면 24보다 크면서 가장 가까운 10의 배수는 30 - 24 = 6 이므로 결과 6이 출력되도록 한다.

        // 강사님 풀이
        int num = 24;
        System.out.println(10 - (num % 10));
    }

}
