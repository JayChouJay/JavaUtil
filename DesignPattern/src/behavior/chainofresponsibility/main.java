package behavior.chainofresponsibility;

public class main {
    public static void main(String[] args) {
        FilterChain chain=new ApplicationFilterChain();
        chain.addFilter(new FilterOne());
        chain.addFilter(new FilterTwo());
        chain.addFilter(new FilterThree());
        chain.doFilter();
    }
}
