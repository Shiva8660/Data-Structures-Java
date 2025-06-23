package Queue14.LeetCode;

import java.util.*;

class StudentSandwichCounter {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, ones = 0;
        for (int val : students) {
            if (val == 0) zero++;
            else ones++;
        }

        for (int s : sandwiches) {
            if (s == 0) {
                if (zero == 0) return ones;
                zero--;
            } else {
                if (ones == 0) return zero;
                ones--;
            }
        }
        return 0;
    }
}

public class SandwichDistributionTest2 {
    public static void main(String[] args) {
        System.out.println("Problem: Count the number of students unable to eat because their sandwich type is unavailable.");
        int[] studentPrefs = {1, 1, 0, 0};
        int[] sandwichStack = {0, 1, 0, 1};
        StudentSandwichCounter counter = new StudentSandwichCounter();
        int result = counter.countStudents(studentPrefs, sandwichStack);
        System.out.println("Number of students who can't eat: " + result);
    }
}

