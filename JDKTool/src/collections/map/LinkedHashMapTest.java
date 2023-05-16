package collections.map;
import org.junit.jupiter.api.Test;


import java.util.LinkedHashMap;

/**
 * 有序的HashMap集合
 */
public class LinkedHashMapTest {
    private LinkedHashMap<String,Object> map=new LinkedHashMap();
    {
        map.put("2","邓紫棋");
        map.put("1","周杰伦");
        map.put("3","张国荣");
    }
    @Test
    public void foreach(){
        System.out.println(map);
    }
}
