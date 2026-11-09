import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // Rollno Name
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Abhishek");
        map.put(102, "Aditya");
        map.put(103, "Abhay");
        map.put(104, "Rohit");

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);

        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("Abhishek"));

        map.remove(102);
        System.out.println(map);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Ashish");
        map2.put(2, "Arpit");
        map2.put(3, "Abhimanyu");

        map.putAll(map2);
        System.out.println(map);

        map2.clear();
        System.out.println(map2);
        System.out.println(map);

        Set<Integer> set = map.keySet();
        System.out.println(set);

        Collection<String> c = map.values();
        System.out.println(c);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        System.out.println(map.getOrDefault(105, "Unknown"));

        System.out.println(map.putIfAbsent(103, "Abhay"));

        map.remove(103, "Abhay");
        System.out.println(map);

        map.replace(104, "Raghav");
        System.out.println(map);

        map.replace(101, "Abhishek", "Sonu");
        System.out.println(map);

        Set<Map.Entry<Integer, String>> entries2 = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " , " + value);
        }
        System.out.println(entries2);

        Map<Integer, String> map3 = Map.of(201, "Ajay", 202, "Abhinav");
        // map3.put(203, "Akash");
        System.out.println(map3);
    }
}
// put() --> always replaces
// putIfAbsent() --> does not replace existing value
