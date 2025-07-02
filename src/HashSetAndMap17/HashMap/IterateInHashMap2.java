package HashSetAndMap17.HashMap;

import java.util.HashMap;

public class IterateInHashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Shiva", 431);
        map.put("Prasad", 347);
        map.put("Reddy", 497);
        map.put("Naveen", 221);
        map.put("Free fire", 422);

        // print key's
        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println();

        // print values
        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
        System.out.println();

        // printing both at the same time
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key + " : " + val);
        }

        // this will print only values
        // using val you can't print key's
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        //print's both at same time like sout--> using entry set
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }


    }
}
