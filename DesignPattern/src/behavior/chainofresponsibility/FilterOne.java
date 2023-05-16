package behavior.chainofresponsibility;

public class FilterOne extends HttpFilter {


    @Override
    public void doFilter(ApplicationFilterChain applicationFilterChain) {
        System.out.println("我是1，我执行了");
        applicationFilterChain.doFilter();
        System.out.println("我是1，我结束了");
    }
}
