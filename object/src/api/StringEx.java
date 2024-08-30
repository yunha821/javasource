package api;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        // java.lang.String
        // 변경 불가능한(immutable) 클래스
        // 한번 생성된 인스턴스는 읽기만 가능한 상태

        String str = "a";
        str = str + "bcd"; // str 파괴하고 다시 공간 생성 후 연결함
        String str5 = "efg";
        str = str + str5; // str 파괴하고 다시 공간 생성 후 연결함
        System.out.println("str 결과 : " + str);

        // 문자열 변경이 가능한 클래스
        // java.lang.StringBuilder
        // java.lang.StringBuffer

        // 문자열 리터럴 지정 : 저장이 된 후 동일한 문자열이 들어오는 경우에는 한번만 저장
        String str1 = "abc";
        String str4 = "abc"; // str1, str4가 동일한 "abc" 가르킴
        // 생성자 사용
        String str2 = new String("abc");
        char ch[] = { 'a', 'b', 'c' };
        String str3 = new String(ch);

        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // false

        // 1. 문자열 비교 : equals() / equalsIgnoreCase() : 대소문자 구분없이 비교
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str4));

        // 2. charAt(int index)
        System.out.println("charAt(1) :" + str1.charAt(1)); // b

        str1 = new String("Hello!! Java");

        // 3. length()
        System.out.println("str1 길이 : " + str1.length());

        // str1 ==> char 배열로 반환
        // ['H', 'e', 'l', 'l']
        char ch1[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        System.out.println(Arrays.toString(ch1));

        // 4. toCharArray() ==> 문자열을 char 배열로 변환
        char ch2[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        // 5. indexOf(찾을문자) : 주어진 문자의 시작 위치를 리턴 / 못찾으면 -1
        System.out.println("indexOf(e) : " + str1.indexOf("e"));
        System.out.println("indexOf(Java) : " + str1.indexOf("Java"));
        System.out.println("indexOf(b) : " + str1.indexOf("b"));
        System.out.println("indexOf(e) : " + str1.indexOf("e")); // char
        System.out.println("indexOf(e) : " + str1.indexOf("e", 4));

        // 6. lastIndexOf(찾을문자) : 문자열 끝에서부터 찾기
        System.out.println("indexOf(e) : " + str1.lastIndexOf("e"));
        System.out.println("indexOf(Java) : " + str1.lastIndexOf("Java"));

        // 7. contains(문자열) : 문자열이 포함되어 있는지 확인 후 true/false 출력
        System.out.println("contains(e) : " + str1.contains("e"));
        System.out.println("contains(f) : " + str1.contains("f"));

        // 8. startsWith(문자열) /endsWith(문자열) : 지정된 문자열로 시작하는지 끝나는지 확인 후 true/false 출력
        str2 = "java.lang.String";
        System.out.println("startsWith() : " + str2.startsWith("java"));
        System.out.println("startsWith() : " + str2.startsWith("lang"));
        str3 = "file.txt";
        System.out.println("startsWith() : " + str3.endsWith("txt"));

        // 9. concat(문자열) : 문자열 뒤로 연결
        System.out.println("concat() : " + str1.concat(str2));

        // 10. replace(old 문자, new 문자) : old 문자를 new 문자로 변경 후 새로운 문자열로 리턴(원본 변경 X)
        str1 = "Hellollo";
        System.out.println(str1.replace("ll", "LL")); // HeLLoLLo
        System.out.println(str1.replaceAll("ll", "LL")); // HeLLoLLo
        System.out.println(str1.replaceFirst("ll", "LL")); // HeLLollo
        System.out.println(str1); // HeLLollo

        // 11. split("패턴 or 분리기호") : 문자열을 분리자로 나누어 문자 배열로 리턴
        String animals = "cat,dog,bear";
        String arr[] = animals.split(",");
        for (String s : arr) {
            System.out.println(s); // cat / dog / bear
        }
        arr = animals.split(",", 2);
        for (String s : arr) {
            System.out.println(s); // cat / dog,bear
        }

        // 12. subString(시작위치) : 시작위치부터 끝까지 잘라내기
        // 12. subString(시작위치, 끝위치) : 시작위치 포함, 끝 위치의 문자는 포함되지 않음
        str1 = "java.lang.Object";
        System.out.println("subStirng(시작위치) : " + str1.substring(10));
        System.out.println("subStirng(시작위치, 끝위치) : " + str1.substring(5, 9));

        // 13. toUpperCase() / toLowerCase() : 대문자 / 소문자로 변환
        System.out.println("toUpperCase() : " + str1.toUpperCase()); // JAVA.LANG.OBJECT
        System.out.println("toLowerCase() : " + str1.toLowerCase()); // java.lang.object

        // 14. trim() : 양쪽 공백제거
        // " Hello World".equals("Hello World")
        // "Hello World ".equals("Hello World")
        str1 = "             Hello World             ";
        System.out.println(str1);
        System.out.println(str1.trim());

        // 15. valueOf() : 기본형(char, int, float, double, boolean) 값을 String으로 변환
        System.out.println("String.valueOf(0) : " + String.valueOf(0)); // 0 => "0"
        System.out.println("String.valueOf(true) : " + String.valueOf(true)); // true => "true"
        System.out.println("String.valueOf(double) : " + String.valueOf(10.5)); // 10.5 => "10.5"

        int i = 100;
        String newStr = String.valueOf(i); // 성능은 valueOf() 가 좋긴하나 편리함을 따진다면 + "" 더 많이 사용함
        newStr = i + ""; // ★★★★★★★★★★★★★

        // Integer.parseInt("33")
        // String을 기본형 값으로 변환 "100" => 100
        int j = Integer.parseInt(newStr);
        System.out.println("j = " + j);

        // NumberFormatException
        // j = Integer.parseInt("33.5");
        // System.out.println("j = " + j);

        double d = Double.parseDouble("33.5");
        System.out.println("d = " + d);

        // "true" ==> true
        boolean b = Boolean.parseBoolean("true");
        System.out.println("b = " + b);

        // int(기본타입) => Integer(참조타입)
        // float => Float / boolean => Boolean / double => Double / char => Charcter
        float f1 = 3.14f;
        Float f2 = 3.14f;

        str1 = "Hello World";
        // 거꾸로 출력
        // dlroW olleH
        for (int k = str1.length() - 1; k >= 0; k--) {
            System.out.println(str1.charAt(k));
        }

        System.out.println();

        // StringBuffer의 reverse() 이용
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());

    }

}
