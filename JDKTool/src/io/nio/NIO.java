package io.nio;


import java.io.UnsupportedEncodingException;
import java.nio.*;
import java.nio.charset.StandardCharsets;

public class NIO {
    ByteBuffer buffer;
    CharBuffer charBuffer;
    ShortBuffer shortBuffer;
    IntBuffer intBuffer;
    LongBuffer longBuffer;
    FloatBuffer floatBuffer;
    DoubleBuffer doubleBuffer;

    //三个状态值：
    //limit:写的时候limit=capacity，读的时候limit=缓冲区内容长度
    //position
    //capacity，容量，不能扩容
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "我是周杰伦";
        String data2 = "我爱王晨";
        //创建
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(data.getBytes(StandardCharsets.UTF_8));
        byteBuffer.put(data2.getBytes());
        //写
        System.out.println("limit =" + byteBuffer.limit());
        System.out.println("position =" + byteBuffer.position());
        System.out.println("capacity =" + byteBuffer.capacity());
        //1024
        //8
        //切换模式：读模式
        byteBuffer.flip();
        byte[] buff = new byte[byteBuffer.limit()];
        //读取剩余长度
        byteBuffer.mark();
        byteBuffer.get(buff);

        System.out.println("limit =" + byteBuffer.limit());
        System.out.println("position =" + byteBuffer.position());
        System.out.println("capacity =" + byteBuffer.capacity());
        byteBuffer.reset();
        System.out.println("limit =" + byteBuffer.limit());
        System.out.println("position =" + byteBuffer.position());
        System.out.println("capacity =" + byteBuffer.capacity());
        byteBuffer.get(buff, 3, 6);
        System.out.println(new String(buff, "UTF-8"));
        byteBuffer.rewind();
        byteBuffer.clear();
        byteBuffer.compact();
        byteBuffer.compact();
        System.out.println("limit =" + byteBuffer.limit());
        System.out.println("position =" + byteBuffer.position());
        System.out.println("capacity =" + byteBuffer.capacity());

    }
}
