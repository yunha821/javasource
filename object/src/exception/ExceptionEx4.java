package exception;

public class ExceptionEx4 {
    public static void main(String[] args) {
        // try~catch~finally
        try {
            // copyFIle();
            System.out.println("예외없음");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 무조건 수행
            deleteTempFile();
        }
    }

    static void copyFIle() throws Exception {
        throw new Exception();
    }

    static void deleteTempFile() {
        System.out.println("파일 삭제");
    }
}
