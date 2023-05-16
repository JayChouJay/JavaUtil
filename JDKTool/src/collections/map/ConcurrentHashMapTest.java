package collections.map;

import org.junit.jupiter.api.Test;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    private ConcurrentHashMap<String,Object> map=new ConcurrentHashMap<>();
    {
        map.put("key1","val1");
        map.put("key2","val2");
        map.put("key3","val3");
    }
    @Test
    public void common(){
        System.out.println(map);
    }

}
