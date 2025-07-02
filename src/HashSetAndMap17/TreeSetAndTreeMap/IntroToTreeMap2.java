package HashSetAndMap17.TreeSetAndTreeMap;

import java.util.TreeMap;

public class IntroToTreeMap2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Cat", 455);
        map.put("Dogesh",999);
        map.put("Anil", 431);
        map.put("Bagyawant", 431);

        // gives in a sorted order based on alphabets and not based on numbers
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key + " -> "+ map.get(key));
        }
    }
}
