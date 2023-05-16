package behavior.chainofresponsibility;

public class FilterThree extends HttpFilter {


    @Override
    public void doFilter(ApplicationFilterChain applicationFilterChain) {
        System.out.println("我是3，我执行了");
        applicationFilterChain.doFilter();
        System.out.println("我是3，我结束了");
    }
}
