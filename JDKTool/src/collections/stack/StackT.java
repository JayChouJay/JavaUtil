package collections.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * Stack继承了Vector
 */
public class StackT {
    //初始化
    Stack stack = new Stack();

    {
        //压栈
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(null);
    }

    @Test
    public void commons() {
        //弹栈
        System.out.println("1.弹栈：\t" + stack.pop());

        //取堆顶一个对象,没有对象会报错
        System.out.println("2.取堆顶一个对象,没有对象会报错:\t" + stack.peek());

        //是否为空
        System.out.println("3.是否为空:\t" + stack.isEmpty());
    }


    @Test
    public void foreach1() {
        System.out.println("-------1-----");
        for (Object val : stack) {
            System.out.println(val);
        }
    }

    @Test
    public void foreach2() {
        System.out.println("-------2-----");
        //不健壮的判断方式，容易抛异常，正确写法是下面的
//        while (stack.peek() != null){
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    public void foreach3() {
        System.out.println("-------3-----");
        //错误的遍历方式
        for (Object val : stack) {
            System.out.println(stack.pop());
        }
    }

}
