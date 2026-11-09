import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        // HashMap / LinkedHashMap

        Map<Integer, String> map = new LinkedHashMap<>();

        Map<Integer, String> map2 = new LinkedHashMap<>(100);

        Map<Integer, String> map3 = new LinkedHashMap<>(100, 0.8f);

        Map<Integer, String> map4 = new LinkedHashMap<>(map3);

        TreeMap<Integer, String> map5 = new TreeMap<>();

        map5.put(101, "Aditya");
        map5.put(102, "Rohit");
        map5.put(103, "Rohan");

        // Navigable Map

        System.out.println(map5.lastEntry());
        System.out.println(map5.subMap(101, 103));

        // SOrted Map
        System.out.println(map5.higherEntry(102));

        System.out.println(map5);
    }
}
