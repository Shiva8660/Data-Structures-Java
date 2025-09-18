package BitManipulation23;
import java.util.Scanner;

// power of 2 in O(1)
class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = 1;
        System.out.println("Enter power : ");
        int pow = sc.nextInt();

        System.out.println(base<<pow);

    }
}