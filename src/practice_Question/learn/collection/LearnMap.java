package practice_Question.learn.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Ravi");
        map.put(2, "Ravi");
        map.put(6, "Ravi");
        map.put(4, "Ravi");
        map.put(5, "Ravi");
        map.put(19, "Mohan");
        System.out.println(map);

        Map<Integer,String> _map2 = new LinkedHashMap<>();
        _map2.put(7,"Hay");
        _map2.put(1, "jai");
        _map2.put(6, "Jettu");

        System.out.println(_map2);

        Map<Integer,String> _map3 = new TreeMap<>();
        _map3.put(7,"Hay");
        _map3.put(1, "jai");
        _map3.put(6, "Jettu");

        System.out.println(_map3);
    }
}
