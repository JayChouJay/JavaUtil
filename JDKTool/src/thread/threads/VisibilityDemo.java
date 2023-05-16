package thread.threads;

import util.Utils;

//可见性
//（CPU）线程底层有缓存
public class VisibilityDemo {

    //JMM内存模型规范
    //synchronized:什么问题都鞥呢解决
    //volatile:缓存失效，并且对内存加锁，
    //happens-before原则
    //程序的顺序性规则
    //传递性原则：A happens-before B B happens-before C
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InterruptedException {
        //创建子线程
        ThreadVolatileDemo thread = new ThreadVolatileDemo();

        //开启子线程
        thread.start();
        //主线程睡眠3s
        Thread.sleep(3000);
        //设置子线程flag
        thread.setFlag(false);
        //主线程睡眠1s
        Thread.sleep(1000);
        //输出子线程状态
        System.out.println("flag=[" + thread.flag + "]");
    }

    static class ThreadVolatileDemo extends Thread {
        //如果不加volatile会导致缓存清理不及时
        public volatile boolean flag = true;
        //public boolean flag = true;

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name + ",==开始执行");
            while (true) {
                //决定是否结束循环
                if (!flag) {
                    System.out.println("执行线程退出");
                    break;
                }
            }
            System.out.println(name + ",==线程停止==");
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }
    }
}
