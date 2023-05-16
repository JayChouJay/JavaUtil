package io.nio;

import org.junit.jupiter.api.Test;


import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * RandomAccessFile
 * <p>
 * 随机访问的file
 * 应用：用户在下载的过程中，很有可能会暂停，断网，退出，下次再进来下载必然想要继续下载
 */
public class RandomAccessFileTest {
    @Test
    public void randomAccessFile() throws Exception {
        //初始化
        //四种模式：r:读，rw:读写，rws:,rwd:
        RandomAccessFile raf = new RandomAccessFile("E:\\知识文件夹\\01 学\\02 计算机\\01 编程语言\\01 JAVA/测试文件夹/abc.txt", "rw");

        ExecutorService pool = Executors.newCachedThreadPool();
//        pool.execute(new HandleMsg());
        raf.seek(1);
        System.out.println(raf.getFilePointer());
        raf.write(257);

//        raf.write(136);
//        raf.write(145);
        int val = raf.read();
        while (val != -1) {
            System.out.print(val + " ");
            val = raf.read();
        }
        raf.close();
        //我爱你王晨
        //230 136 145 231 136 177 228 189 160 231 142 139 230 153 168
        //我爱你
        //230 136 145 231 136 177 228 189 160
//        System.out.println(v1+" "+v2+" "+v3+" "+v4);
//        System.out.println(raf.read()+" "+raf.read());

    }
}
