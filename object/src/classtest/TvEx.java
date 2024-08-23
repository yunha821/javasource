package classtest;

public class TvEx {
    public static void main(String[] args) {

        Tv tv = new Tv();

        // private 키워드가 붙은 경우에 외부에서 직접 호출 불가(.찍고 호출)
        // System.out.println("현재 채널 : " + tv.channel); // 0
        // System.out.println("현재 전원상태 : " + tv.power); // false(기본값)
        // System.out.println("제조사 : " + tv.company); // null

        Tv tv2 = new Tv(7, true, "삼성");

        // 메소드 호출
        int channel = tv2.getChannel();
        System.out.println("현재 채널: " + channel);

        // 메소드 호출
        tv2.chaneelUp();
        System.out.println("현재 채널: " + tv2.getChannel());

        // tv 전원 종료
        Boolean power = tv2.isPower();
        System.out.println(power);
        tv2.power();
        System.out.println("현재 전원 상태: " + tv2.isPower());

        String company = tv2.getCompany();
        System.out.println(company);
    }

}
