import java.util.*;

public class ArrayListCreate {
    public static void main(String[] args) {
        // collection two type :non generic type:store hetrogenous data
        ArrayList al = new ArrayList();// array list part collection is created
        // generic type :<wrapper class >:homogenous data
        ArrayList<Integer> al1 = new ArrayList<>();

        // another way :homogenous data
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        // arraylist create through iterable interface 
        Iterable itr = new ArrayList<>();

        // collection :interface :create arraylist through collection
        Collection al3 = new ArrayList<>();

        // list :interface :create arraylist through list interface
        List ll = new ArrayList<>();
    }
}
