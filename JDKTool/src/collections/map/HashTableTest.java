package collections.map;


import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class HashTableTest {
    private Hashtable hashtable=new Hashtable();
    {
        hashtable.put("1","周杰伦");
        hashtable.put("2","郭富城");
        hashtable.put("3","邓紫棋");
        hashtable.put("4","张国荣");
    }
    @Test
    public void tableTest(){
        System.out.println(hashtable);
    }
}
