package algorithm.a5hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 找不同
 * 来源：leetCode-389
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 */
public class BFindTheDifference {

    /**
     * 自己写的，很菜
     */
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            Integer sCount = sMap.get(s.charAt(i));
            Integer tCount = tMap.get(t.charAt(i));
            if (sCount != null) {
                sMap.put(s.charAt(i), sCount + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
            if (tCount != null) {
                tMap.put(t.charAt(i), tCount + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        Integer count = tMap.get(t.charAt(t.length() - 1));
        if (count != null)
            tMap.put(t.charAt(t.length() - 1), count + 1);
        else
            tMap.put(t.charAt(t.length() - 1), 1);
        // System.out.println(tMap);
        // System.out.println(sMap);
        Set<Character> set = tMap.keySet();
        for (Character c : set) {
            Integer sCount = sMap.get(c);
            Integer tCount = tMap.get(c);
            // System.out.println(c + " " + sCount + " -- " + tCount);
            if (!tCount.equals(sCount)) {
                return c;
            }
        }

        return 0;
    }

    /**
     * 高级法
     */
    public static char findTheDifference2(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                //获取次数
                int newNum = map.get(c) + 1;
                map.put(c, newNum);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            //在s总从未出现的字母
            if (!map.containsKey(c)) {
                return c;
            }
            //如果出现了两次，返回
            if (map.get(c) == 0) {
                return c;
            }
            int newNum = map.get(c) - 1;
            map.put(c, newNum);
        }
        return 0;
    }

    /**
     * 字符串替换法
     */
    public static char findTheDifference3(String s, String t) {
        for (Character c : s.toCharArray()) {
            //替换第一个出现的位置,记得接收返回值
            t = t.replaceFirst(c.toString(), "");
        }
        return t.charAt(0);
    }

    /**
     * 字符串差和法
     */
    public static char findTheDifference4(String s, String t) {
        int charSum = 0;

        for (int i = 0; i < s.length(); i++) {
            charSum += t.charAt(i) - s.charAt(i);
        }
        charSum += t.charAt(t.length() - 1);
        return (char) charSum;
    }

    /**
     * 异或运算
     */
    public static char findTheDifference5(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return (char) result;
    }

}
