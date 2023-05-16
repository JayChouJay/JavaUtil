package algorithm.a3stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 逆波兰表达法
 */
public class CReversePolishNotation {
    /**
     * 中缀转后缀
     */
    public static void transfer(String str) {
        //运算符
        Stack<Character> stack1 = new Stack<>();
        //结果
        Stack<Character> stack2 = new Stack<>();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                case '-':
                case '*':
                case '/':
                    //两种情况 直接存入s1
                    //如果s1为空 或者 栈顶元素是左括号
                    //如果 当前运算符 优先级比栈顶元素高 直接存入
                    while (true) {
                        if (stack1.isEmpty() || stack1.peek().equals('(') || compare(chars[i], stack1.peek()) > 0) {
                            stack1.push(chars[i]);
                            break;
                        }
                        stack2.push(stack1.pop());
                    }
                    break;
                case '(':
                    stack1.push('(');
                    break;
                case ')':
                    while (stack1.peek() != '(') {
                        stack2.push(stack1.pop());
                    }
                    stack1.pop();
                    break;
                default:
                    stack2.push(chars[i]);
            }
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        //将栈中元素 倒序输出到数组中
        String[] result = new String[stack2.size()];
        int size = stack2.size() - 1;
        while (!stack2.isEmpty()) {
            result[size] = stack2.pop() + "";
            size--;
        }
        System.out.println(Arrays.toString(result));
    }

    /**
     * 乘除大于加减 1代表c1优先级高 -1代表c2优先级高 0代表相同
     *
     * @param c1
     * @param c2
     * @return
     */
    public static int compare(char c1, char c2) {
        if (c1 == '+' || c1 == '-') {
            if (c2 == '*' || c2 == '/') {
                return -1;
            }
            return 0;
        }
        if (c1 == '*' || c1 == '/') {
            if (c2 == '+' || c2 == '-') {
                return 1;
            }
            return 0;
        }
        return 0;
    }
}
