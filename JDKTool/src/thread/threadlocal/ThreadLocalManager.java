package thread.threadlocal;

import java.util.HashMap;

public class ThreadLocalManager {
    //管理不同的ThreadLocal对象
    private static HashMap<String, ThreadLocal> localMap = new HashMap<>();

    //获取ThreadLocal对象
    public static ThreadLocal getThreadLocal(String name) {
        ThreadLocal local = localMap.get(name);
        if (local == null) {
            local = new ThreadLocal();
            localMap.put(name, local);
        }
        return local;
    }
}
