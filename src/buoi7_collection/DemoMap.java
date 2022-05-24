package buoi7_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("ipX",  8);
        map.put("ip11", 13);
        map.put("ip12", 18);
        map.put("ip13", 28);
        System.out.println(map);
        
        map.put("ip12", 88);
        System.out.println(map);
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
