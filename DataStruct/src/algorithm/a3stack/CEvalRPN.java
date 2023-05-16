package algorithm.a3stack;

import java.util.Stack;

/**
 * 逆波兰表达式求值
 * <p>
 * 给你一个字符串数组 tokens ，表示一个根据 逆波兰表示法 表示的算术表达式。
 * <p>
 * 请你计算该表达式。返回一个表示表达式值的整数。
 * <p>
 * 注意：
 * <p>
 * 有效的算符为 '+'、'-'、'*' 和 '/' 。
 * 每个操作数（运算对象）都可以是一个整数或者另一个表达式。
 * 两个整数之间的除法总是 向零截断 。
 * 表达式中不含除零运算。
 * 输入是一个根据逆波兰表示法表示的算术表达式。
 * 答案及所有中间计算结果可以用 32 位 整数表示。
 * 输入：tokens = ["2","1","+","3","*"]
 * 输出：9
 */
public class CEvalRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int val1, val2;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                val2 = stack.pop();
                val1 = stack.pop();
                stack.push(val1 + val2);
            } else if (tokens[i].equals("-")) {
                val2 = stack.pop();
                val1 = stack.pop();
                stack.push(val1 - val2);
            } else if (tokens[i].equals("*")) {
                val2 = stack.pop();
                val1 = stack.pop();
                stack.push(val1 * val2);
            } else if (tokens[i].equals("/")) {
                val2 = stack.pop();
                val1 = stack.pop();
                stack.push(val1 / val2);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static int evalRPN2(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int val1, val2;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    val2 = stack.pop();
                    val1 = stack.pop();
                    stack.push(val1 + val2);
                    break;
                case "-":
                    val2 = stack.pop();
                    val1 = stack.pop();
                    stack.push(val1 - val2);
                    break;
                case "*":
                    val2 = stack.pop();
                    val1 = stack.pop();
                    stack.push(val1 * val2);
                    break;
                case "/":
                    val2 = stack.pop();
                    val1 = stack.pop();
                    stack.push(val1 / val2);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.pop();
    }
}
