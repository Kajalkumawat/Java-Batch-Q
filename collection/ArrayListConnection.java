import java.util.*;
public class ArrayListConnection{
    public static void main(String[] args){
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        System.out.println(al1);
        ArrayList<Integer> al2=new ArrayList<>(al1);
        al2.add(4);
        al2.add(5);
        al2.add(6);
        System.out.println(al2);
    }
}