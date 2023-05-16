package thread.producerandcustomer;

public class Producer extends Thread {
    String name;
    Warehouse wh;

    public Producer(String name,Warehouse wh) {
        this.name=name;
        this.wh = wh;
    }
    @MyAnnotation("1")
    void test(){}

    @Override
    public void run() {
        while (true) {
            int result=wh.add();
            if (result>0)
                System.out.println(name+"生产了一-----个产品："+result+" 当前库存："+ wh.list.size());
            try {
                this.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
