package HashSetAndMap17.HashMap;

import java.util.HashMap;

public class basicHashMap1 {
    public static void main(String[] args) {
        // key and value we usually insert in a hashmap
        // In this also all basic operation runs in O(1) TC like hashSet
        HashMap<String, Integer> map = new HashMap<>();

        // using put I can updates values also
        map.put("Shiva", 431);
        map.put("Prasad", 347);
        map.put("Reddy", 497);
        map.put("Naveen", 221);
        map.put("Free fire", 422);

        System.out.println(map);

        // If I am putting key as same and changing value then => Existing key will be replaced only
        map.put("Shiva", 999);
        System.out.println(map);

        // In a  hashMap unique key's will be there but not values(duplicate may be)
        // All keys can have same values this is allowed
        map.put("king maker", 999);
        System.out.println(map);

        System.out.println(map.containsKey("Shiva"));
        System.out.println(map.containsValue(431));

        System.out.println(map.containsKey("Shiva"));
        System.out.println(map.containsValue(430));

        System.out.println(map);

        // size
        System.out.println("the size of map is : " + map.size());


       // remove -> If you are removing element which is not there in map then no error will come -> it return false
        map.remove("Shiva");
        map.remove("Naveen", 221);

        System.out.println(map.remove("Naveen", 221));
        System.out.println(map);

        // to delete all key values from map
        map.clear();

        map.put("Shiva", 431);
        map.put("Prasad", 347);
        map.put("Reddy", 497);
        map.put("Naveen", 221);
        map.put("Free fire", 422);

        // get -> takes the key and gives the value of that pair
        System.out.println(map.get("Shiva"));
        System.out.println(map.get("Prasad"));
        System.out.println(map.get("Reddy"));
        System.out.println(map.get("Free fire"));
    }
}
