package ArrayListBasic;

import java.util.ArrayList;
import java.util.List;

public class TwoDimArrayList1 {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);

        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();
        d.add(60);

        // two methods to print 1Dim - arraylist
//        System.out.println(a);
//        for(int i=0;i<a.size();i++){
//            System.out.print(a.get(i) + " ");
//        }

        List<List<Integer>> list = new ArrayList<>();
        list.add(a);  list.add(b);  list.add(c);  list.add(d);

        // directly you can print all arraylist which are present inside an arrayList
        //       System.out.println(list);

        //Now using for loop
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        // now printing using double loop

//        for (int i = 0; i < list.size(); i++) {
//            List<Integer> x = list.get(i);
//            for (int j = 0; j < x.size(); j++) {
//                System.out.print(x.get(j)+" ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // to print particular element
//        System.out.println(list.get(1).get(1));

       //   error becoz there is no element
       //   System.out.println(list.get(1).get(2));



    }
}
