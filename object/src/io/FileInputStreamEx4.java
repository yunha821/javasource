package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {
    public static void main(String[] args) {

        // try-with resources
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아 줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\car.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_car2.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            int data = 0;

            // 1024 바이트로 읽고, 1024 바이트로 쓰고
            byte b[] = new byte[4096];
            while ((data = bis.read(b)) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
