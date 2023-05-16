package algorithm.a3stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AIsValid {
    public static boolean isValid(String s) {
        //用映射关系，记录匹配 () [] {}
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (map.containsKey(c)) {
                //左括号
                stack.push(c);
            } else {
                //右括号
                //有括号出现，但左括号仍未出现
                if (stack.isEmpty()) {
                    System.out.println("右括号出现 但左括号还未出现");
                    return false;
                }
                char top = stack.peek();
                if (!map.get(top).equals(c)) {
                    System.out.println("右括号出现 但不是与之对应的左括号");
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.empty()) {
            System.out.println("左括号出现 但右括号仍未出现");
            return false;
        }
        return true;
    }

    //当出现左括号时 直接存入右括号
    //当出现右括号时 直接取出栈顶元素匹配
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.empty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.empty();
    }
}
