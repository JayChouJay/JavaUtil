package io.nio;

import java.nio.charset.StandardCharsets;

public class TestNIO {
    public static void main(String[] args) {
        String str = "我爱你王晨";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < str.length(); i++) {
            System.out.println((int)str.charAt(i));
        }
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }
}
