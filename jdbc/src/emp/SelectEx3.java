package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx3 {
    public static void main(String[] args) {
        
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";
        
        String sql = "SELECT * FROM emp";

        // SelectEx => try-resource 형태로 변경
        // finally  자원 닫기 자동으로 처리
        try (Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt =  con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery(); ) {

            Class.forName("oracle.jdbc.OracleDriver");

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
            
        } catch (Exception e) {
            e.printStackTrace();
        }     
    }
    }
}
