package StringsAndStringBuilders;

public class AboutInsertAndDelete8 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);

        // after deleting 4th index came now at 3 index like that only 5th came into 4th
        s.deleteCharAt(3);
        System.out.println(s);

        s.append("xyz");
        System.out.println(s);

        // index start se  end -1 tak delete hote he
        s.delete(2,6);
        System.out.println(s);

        // this will replace character => y is get replaced by c
        s.setCharAt(2,'c');
        System.out.println(s);

        // now I want to insert => inserted d at index 3
        s.insert(3,'d');
        System.out.println(s);

        // we can insert number as well => now your going to insert two digit number first number will take consume one index and second one also consume next index
        s.insert(4,68);
        System.out.println(s);

        // you can insert string and boolean also
        s.insert(6,"Shiva");
        System.out.println(s);

        s.insert(12,true);
        System.out.println(s);

        System.out.println(s.charAt(13));
    }
}
