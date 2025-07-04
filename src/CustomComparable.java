import java.util.*;

class Triplet1 implements Comparable<Triplet1> {
    int dist;
    int x;
    int y;

    Triplet1(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplet1 t) {
        return this.dist - t.dist;
    }
}

public class CustomComparable {

    // Print function for list of Triplets
    public static void printTriplets(List<Triplet1> list) {
        for (Triplet1 t : list) {
            System.out.println("dist: " + t.dist + ", x: " + t.x + ", y: " + t.y);
        }
    }

    public static void main(String[] args) {
        List<Triplet1> list = new ArrayList<>();
        list.add(new Triplet1(9, 1, 2));
        list.add(new Triplet1(4, 3, 5));
        list.add(new Triplet1(7, 0, 6));
        list.add(new Triplet1(1, 8, 3));

        System.out.println("Before Sorting:");
        printTriplets(list);

        Collections.sort(list);  // Sorts by dist

        System.out.println("\nAfter Sorting by dist:");
        printTriplets(list);
    }
}
