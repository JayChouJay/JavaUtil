package thread.producerandcustomer;

public class Customer extends Thread {
    String name;
    private Warehouse wh;
    int count;

    public Customer(String name, Warehouse wh) {
        this.name = name;
        this.wh = wh;
    }

    @Override
    public void run() {
        while (true) {
            int result = wh.get();
            if (result > 0) {
                System.out.println(name + "第" + ++count + "次买走了一件商品：" + result);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
