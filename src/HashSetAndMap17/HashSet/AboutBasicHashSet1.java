package HashSetAndMap17.HashSet;

import java.util.HashSet;

public class AboutBasicHashSet1 {
    public static void main(String[] args) {

        // you can store character or strings ets
        HashSet<Integer> set = new HashSet<>();

        // Insertion : TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);

        // When we print there is no order and values are stored at random
        System.out.println(set);

        // search or contains (tree or false) -> in set with TC = O(1)
        System.out.println(set.contains(200));
        System.out.println(set.contains(-8));
        System.out.println(set.contains(1));
        System.out.println(set.contains(2));

        // Insertion : TC = O(1)
        set.add(1);
        set.add(2);

        System.out.println(set.contains(1));
        System.out.println(set.contains(2));

        //find size -> TC : O(1)
        System.out.println(set.size());

        System.out.println(set);

        // Remove : TC : O(1)
        System.out.println(set.remove(1));
        System.out.println(set.remove(2));
        System.out.println(set.remove(3));

        System.out.println(set);

        // set to array
        // int[] arr = set.toArray(); // -> this is giving error bcoz set has wrapper class and now I am creating int array
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
