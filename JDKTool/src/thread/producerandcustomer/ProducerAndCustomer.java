package thread.producerandcustomer;


import java.util.Timer;
import java.util.TimerTask;

public class ProducerAndCustomer {
    public static void main(String[] args) {
        Warehouse wh=new Warehouse();
        Producer producer=new Producer("周杰伦",wh);
        producer.setPriority(9);
        producer.start();

        Customer c1=new Customer("邓紫棋",wh);
        Customer c2=new Customer("巩俐",wh);
        c1.start();
        c2.start();
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        },100,100);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        },100,100);

    }
}
