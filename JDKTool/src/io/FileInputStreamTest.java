package io;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * FileInputStream/FileOutputStream
 *
 * 性质：低级字节流
 * <p>
 * 继承：InputStream/OutputStream
 */
public class FileInputStreamTest {
    @Test
    public void common() throws IOException {
        File file = new File("d://");
        //初始化
        FileInputStream fis = new FileInputStream(file);
        FileInputStream fis1 = new FileInputStream("d://test");
        //相对路径初始化
        FileInputStream fis2 = new FileInputStream("test");

        //没有的话创建
        //覆盖
        FileOutputStream fos = new FileOutputStream(file);
        //追加
        fos = new FileOutputStream(file, true);
        fos = new FileOutputStream("d:test", true);

        byte[] bytes = new byte[1024];
        int code = fis.read();
        int count = fis.read(bytes);
        fis.close();
        //查看管道内缓存（字节）
        fis.available();
        //跳过一段
        fis.skip(2);
        System.out.println();

        fos.write(2);
        fos.write(bytes);
        fos.flush();
        fos.close();

    }
}
