package io;

import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Properties
 * 性质：高级文件流
 * 继承关系：是HashTable的子类
 * Properties文件：key = value （'=' | ‘,’ |  ' '  | ',' ）
 * 相关：Enumeration与Iterater的对比
 */
public class PropertiesTest {
    //初始化
    private Properties pro = new Properties();

    @Test
    public void common() throws IOException {

        File file = new File("src/io/test.properties");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        FileReader fileReader = new FileReader(file);
        pro.load(fileReader);

        //存值
        pro.put("key", "value");
        //取值
        String value = pro.getProperty("key");
        //遍历：
        Enumeration en = pro.propertyNames();
        //判断有没有多余的元素
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();
            System.out.println(key);
        }


    }

}
