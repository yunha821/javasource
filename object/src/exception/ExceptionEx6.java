package exception;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try {
            startInsatll();
            copyFIle();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후 다시 설치하기시 바랍니다.");
        } catch (MemoryException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace(); // 개발시
            System.out.println("다시 설치하세요.");
        } finally {
            deleteTempFile();
        }
    }

    static void startInsatll() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFIle() {
    }

    static void deleteTempFile() {

    }

    static boolean enoughMemory() {
        return true;
    }

    static boolean enoughSpace() {
        return false;
    }
}
