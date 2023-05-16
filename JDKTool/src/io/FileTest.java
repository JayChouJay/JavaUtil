package io;

import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;

/**
 * File
 * 原理：File存在内存中，与硬盘上的文件有一个映射关系
 * 作用：查看文件属性，文件夹的遍历和删除。创建新文件，查看父元素目录。
 */
public class FileTest {
    //初始化
    //通过带参数的构造方法创建对象
    File file = new File("d://test");
    //相对路径
    File file2 = new File("test");//D:\Program Files (x86)\Java\IdeaProjects\JavaUtil\JDKTool\test

    @Test
    public void common() throws IOException {
        System.out.println("获取file的绝对路径：\t" + file.getAbsoluteFile());
        System.out.println("获取file1的绝对路径：\t" + file2.getAbsoluteFile());
        System.out.println("获取File名:\t" + file.getName());
        //创建文件:如果file不是文件则也会创建文件
        file.createNewFile();
        //创建目录：如果file不是文件夹，也会创建文件夹
        file.mkdir();
        //创建多层目录
        file.mkdirs();
        //获取父级文件夹
        File parentFile = file.getParentFile();
        //获取父亲文件夹名字
        String name = file.getParent();

        //获取子元素
        File[] files = file.listFiles();
        //获取子元素的名字
        file.list();
        //删除空文件夹/文件,不能删除带文件的文件夹
        file.delete();

        file.canRead();
        file.canWrite();
        file.isHidden();
        file.length();
        file.lastModified();
        file.isFile();
        file.isDirectory();
    }
}
