package structure.proxy;

public class ChickenProxy implements Chicken {
    //目标对象，被代理的对象
    private Chicken target;

    public ChickenProxy(Chicken target) {
        this.target = target;
    }

    @Override
    public void call() {
        long startTime = System.nanoTime();
        this.target.call();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass().getSimpleName() + "call方法耗时（纳秒）:" + (endTime - startTime));
    }

    @Override
    public void behavior() {
        long startTime = System.nanoTime();
        this.target.behavior();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass().getSimpleName() + "behavior方法耗时（纳秒）:" + (endTime - startTime));
    }
}
