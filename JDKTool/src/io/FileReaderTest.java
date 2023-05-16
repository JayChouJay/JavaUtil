package io;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * FileReader/FileWriter
 *
 * 性质：低级字符流
 * <p>
 * 只能操作纯文本文件：txt，properties，xml（可以用记事本打开）
 * 注意：如果乱码首先考虑将文件另存为UTF-8
 */
public class FileReaderTest {
    @Test
    public void fileReader() throws IOException {
        File file = new File("d://test");
        //初始化
        FileReader reader = new FileReader(file);
        reader = new FileReader("d://test");

        char[] chars = new char[1024];
        int code = reader.read();
        int count = reader.read(chars);
        reader.close();
    }

    @Test
    public void fileWriter() throws IOException {
        File file = new File("d://test");
        //初始化
        FileWriter reader = new FileWriter(file);
        reader = new FileWriter("d://test");
        //true追加
        reader = new FileWriter(file, true);

        char[] chars = new char[1024];
        reader.write(2);
        reader. write(chars);
        reader. write("zjl");
        reader. flush();
        reader.close();
    }
}
