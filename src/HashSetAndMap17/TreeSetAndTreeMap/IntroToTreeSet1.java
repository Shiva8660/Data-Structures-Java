package HashSetAndMap17.TreeSetAndTreeMap;

import java.util.TreeSet;

public class IntroToTreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // TC = O(logn)
        set.add(100); set.add(80); set.add(60); set.add(40); set.add(20);

        // TreeSet always gives you in sorted order -> Internally uses Balanced BST
        for(int ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();

        // next you can explore all the other operation which are HashSet
    }
}
