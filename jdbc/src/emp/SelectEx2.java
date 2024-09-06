package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 구문 시에만 사용

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. connection 을 통해서 실행하고자 하는 sql 구문 전송
            String sql = "SELECT * FROM emp";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            System.out.println("-------------------------------------------------");
            System.out.println(
                    "empno   ename  job     mgr  hiredate   sal  comm   deptno");
            System.out.println("--------------------------------------------------");

            // 6. 결과값이 담긴 rs에서 하나씩 조회 - 행단위로 담겨져 있음
            while (rs.next()) { // rs.next() > 행 하나 넘어오는 작업
                // DB 타입 number => getInt() / varchar2 => getStirng() / date => getDate()
                // () 안에는 컬럼 번호(1번부터) or 컬럼명 가능
                System.out.print(rs.getInt("empno") + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.print(rs.getDate(5) + "\t");
                System.out.print(rs.getInt(6) + "\t");
                System.out.print(rs.getInt(7) + "\t");
                System.out.println(rs.getInt(8));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close(); // 항상 마지막에 닫는다
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
