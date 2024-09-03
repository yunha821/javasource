package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        // 입력 스트림 : file 에서 읽어오기
        FileInputStream fis = null;
        // 출력 스트림 : file 에 쓰기
        FileOutputStream fos = null;
        try {
            // fis = new FileInputStream("c:\\temp\\file1.txt");
            fis = new FileInputStream("c:\\temp\\car.jpg");
            // fos = new FileOutputStream("c:\\temp\\output1.txt");
            fos = new FileOutputStream("c:\\temp\\output_car2.jpg");

            int data = 0;
            // // read(): 1byte 씩 읽어오기
            // while ((data = fis.read()) != -1) {
            // // System.out.print((char) data);
            // fos.write(data);

            // }

            // 1024 바이트로 읽고, 1024 바이트로 쓰고
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
