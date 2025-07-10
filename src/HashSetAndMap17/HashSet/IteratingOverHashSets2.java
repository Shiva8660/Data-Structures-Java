package HashSetAndMap17.HashSet;

import java.util.HashSet;

public class IteratingOverHashSets2 {
    public static void main(String[] args) {

        // to iterate over hashset you need to use for each loop because there is no concept of indices in hashset
        HashSet<Integer> s = new HashSet<>();
        s.add(1); s.add(2); s.add(3); s.add(4);
        s.add(5); s.add(6); s.add(7); s.add(8);

        for(int ele : s){
            System.out.print(ele + " ");
        }
        System.out.println();



//        // you can't add or remove while Iterating and For sure it will give error
//        for(int ele : s){
//            System.out.print(ele + " ");
//            s.add(ele);
//        }
//        for(int ele : s){
//            System.out.print(ele + " ");
//            s.remove(ele);
//        }

        // to delete all the element from Hashset
        s.clear();
        System.out.println(s);

        // you are going to add same element twice or thrice there will be one occurrence in hashSet(No duplicates are allowed)
        s.add(1); s.add(2);
        s.add(1); s.add(2);
        s.add(1); s.add(2);

        System.out.println(s + " " + s.size());

        s.remove(1); s.remove(2);

        // Only one occurrence and now hashSet is empty
        System.out.println(s + " " + s.size());

    }
}
