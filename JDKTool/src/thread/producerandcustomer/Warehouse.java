package thread.producerandcustomer;

import java.util.ArrayList;

public class Warehouse {
    ArrayList list = new ArrayList();
    int count=0;

    public synchronized int add() {
        if (list.size() >= 20) {
            try {
                notifyAll();
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return -1;
        } else {
            list.add(++count);
            return count;
        }
    }

    public synchronized int get() {
        if (list.size() > 0) {
            return (int)list.remove(0);
        } else {
            try {
                this.notifyAll();
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return -1;
        }
    }
}
