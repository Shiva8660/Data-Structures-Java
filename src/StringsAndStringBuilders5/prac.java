package StringsAndStringBuilders;


public class prac {
    private static String maxS(String a, String b) {
        String s = purify(a);
        String t = purify(b);

        if(s.length() > t.length()) return a;
        if(t.length() > s.length()) return b;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        return a;
    }


    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0'){
                return s.substring(i);
            }
        }
        return s;
    }


    public static void main(String[] args) {

        String[] arr = {"999","1018","2089","4822885999528563966","4822885999528563969","57506664762520","889244263558524"};

        String maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxNum = maxS(maxNum,arr[i]);
        }
        System.out.println("The maxNumber is : " + maxNum);
    }



}
