package StringsAndStringBuilders;

public class IntegerBluderInString17 {
    public static void main(String[] args) {
        String[] arr = {"999","1018","2089","4822885999528563966","57506664762520","889244263558524"};

        String maxNum = arr[0];

        for(int i = 1; i < arr.length; i++) {  // Start from index 1
            maxNum = maxString(maxNum, arr[i]);
        }

        System.out.println("The max number is : " + maxNum);
    }

    private static String maxString(String a, String b) {
        String s = purify(a);
        String t = purify(b);

        if(s.length() > t.length()) return a;
        if(s.length() < t.length()) return b;

        // If lengths are equal
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }

        return a;  // If both strings are equal, return any one
    }

    private static String purify(String b) {
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i) != '0') return b.substring(i);
        }
        return b;
    }
}