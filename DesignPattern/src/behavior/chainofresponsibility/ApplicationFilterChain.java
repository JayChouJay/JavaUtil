package behavior.chainofresponsibility;

import java.util.ArrayList;

public class ApplicationFilterChain implements FilterChain {
    private ArrayList<Filter> filterList = new ArrayList<>();
    private int index = 0;

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void doFilter() {
        if (index < filterList.size()) {
            Filter currentFilter = filterList.get(index++);
            currentFilter.doFilter(this);
        } else {
            System.out.println("找到了真正的资源");
            //findController();
        }
    }
}
