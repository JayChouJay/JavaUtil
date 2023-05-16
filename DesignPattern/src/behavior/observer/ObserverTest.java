package behavior.observer;


import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    public void observerTest() {
        Uploader uploader = new Uploader();
        Observer observer1 = new FansObserver("光头强");
        Observer observer2 = new FansObserver("熊大");
        Observer observer3 = new FansObserver("ikun");
        //关注up
        uploader.addObserver(observer1);
        uploader.addObserver(observer2);
        uploader.addObserver(observer3);
        //发布视频
        uploader.sendMessage("小欧发布关于“设计模式”视频");
    }
    @Test
    public void test2(){
        Uploader uploader = new Uploader();
        Observer observer1 = new FansObserver("光头强");
        Observer observer2 = new FansObserver("熊大");
        Observer observer3 = new FansObserver("ikun");
        //关注up
        uploader.addObserver(observer1);
        uploader.addObserver(observer2);
        uploader.addObserver(observer3);
        //发布视频
        uploader.sendMessage("小欧发布关于“姬霓太美”视频");

        System.out.println("========ikun取关后=========");
        uploader.removeObserver(observer3);
        uploader.sendMessage("小欧发布关于“设计模式”视频");
    }
}
