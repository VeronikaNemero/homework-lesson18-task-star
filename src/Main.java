import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(9, "Veronika");
        map.put(1, "Alex");
        map.put(13, "Pete");
        map.put(145, "Sara");
        map.put(23, "Nika");


        HashSet<Integer> id = new HashSet<>(Set.of(1, 2, 5, 8, 9, 13));
        List<String> result = map.entrySet().stream().filter(entry -> id.contains(entry.getKey())).filter(entry -> entry.getValue().length() % 2 != 0).map(entry -> new StringBuilder(entry.getValue()).reverse().toString()).toList();
        result.forEach(System.out::println);
    }
}