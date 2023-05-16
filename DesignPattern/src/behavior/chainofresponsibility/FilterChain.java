package behavior.chainofresponsibility;

public interface FilterChain {
    void doFilter() ;
    void addFilter(Filter filter);
}
