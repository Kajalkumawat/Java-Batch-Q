import java.util.*;

public class TreeSetBasic1 {
    public static void main(String[] args) {
        // sorted form
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(1);
        ts1.add(5);
        ts1.add(2);
        ts1.add(4);
        System.out.println(ts1);
        // does not allow duplicate data
        ts1.add(67);
        ts1.add(4);
        System.out.println(ts1);

        //can we create non generic class :yes but does not stored hetrogenous 
        TreeSet ts=new TreeSet<>();
        ts.add(1);
        ts.add(3);
        System.out.println(ts);
    }
}
