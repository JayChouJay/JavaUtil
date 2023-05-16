package behavior.chainofresponsibility;

public class FilterTwo extends HttpFilter {


    @Override
    public void doFilter(ApplicationFilterChain applicationFilterChain) {
        System.out.println("我是2，我执行了");
        applicationFilterChain.doFilter();
        System.out.println("我是2，我结束了");
    }
}
