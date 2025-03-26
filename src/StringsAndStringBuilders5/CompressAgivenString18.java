package StringsAndStringBuilders;

// deepSeek method
//public class CompressAgivenString18 {
//    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("aaaabbbaaac");
//
//        int n = str.length();
//        int i = 0;
//
//        StringBuilder compressedString = new StringBuilder();
//
//        while (i < n) {
//            char currentChar = str.charAt(i);
//            int count = 1;
//
//            // Count consecutive occurrences of the current character
//            while (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
//                count++;
//                i++;
//            }
//
//            // Append the character and its count to the compressed string
//            compressedString.append(currentChar);
//            if(count>1) compressedString.append(count);
//
//            // Move to the next character
//            i++;
//        }
//
//        System.out.println("Compressed String: " + compressedString);
//    }
//}

// Raghav sir's => two pointer method
// leetCode - 443
// better 100 times use stringBuilders

public class CompressAgivenString18 {
    public static void main(String[] args) {
        String str ="aaaabbbaaac";
        char[] arr = str.toCharArray();
        String ans = "";

        int n = str.length();
        int i = 0, j = 0;

        while (j < n) {
            if (arr[i] == arr[j]) j++;
            else {
                ans += arr[i];
                int len = j - i;
                if (len > 1) ans += len;
                i = j;
            }
        }
        ans += arr[i];
        int len = j - i;
        if (len > 1) ans += len;

        System.out.println(ans);

    }
}
