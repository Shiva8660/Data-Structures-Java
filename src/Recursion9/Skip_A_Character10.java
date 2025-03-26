package Recursion;

public class Skip_A_Character10 {

    public static void print(int i,String s){
        if(i == s.length()) return;
        if(s.charAt(i) != 'a') System.out.print(s.charAt(i));
        print(i+1,s);
    }

    public static void main(String[] args) {
        String str = new String("Sai Sai");
        print(0,str);

    }
}
