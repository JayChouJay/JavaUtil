package io;

import java.io.*;

/**
 * 高级(缓冲)字节流：BufferedInputStream/BufferedOutputStream
 * 高级(缓冲)字符流：BufferedReader/BufferedWriter
 * <p>
 * 性质：将低级流包装起来，使用方式没有什么差别
 * 性能：比低级流好一些
 * 构建：需要低级流作为参数
 */
public class BufferedInputStreamTest {
    public void bufferedInputStream() throws IOException {
        InputStream stream = new FileInputStream("d://test");
        //初始化
        BufferedInputStream inputStream = new BufferedInputStream(stream);
        int code = inputStream.read();
    }

    public void bufferedOutputStream() throws FileNotFoundException {
        OutputStream stream = new FileOutputStream("d://test");
        //初始化
        BufferedOutputStream outputStream = new BufferedOutputStream(stream);
    }

    public void bufferedReader() throws IOException {
        FileReader fileReader = new FileReader("d://test");
        //初始化
        BufferedReader reader = new BufferedReader(fileReader);

        //Reader才有，读取一行
        String value = reader.readLine();
    }

    public void bufferedWriter() throws IOException {
        FileWriter fileWriter=new FileWriter("d://test");
        BufferedWriter writer=new BufferedWriter(fileWriter);

        //Writer才有，写一行
        writer.write("zjl");
        writer.newLine();
    }
}
