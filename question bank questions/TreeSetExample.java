import java.util.*;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(4);
        myTreeSet.add(2);
        myTreeSet.add(45);
        myTreeSet.add(83);
        myTreeSet.add(60);
        myTreeSet.add(420);
        myTreeSet.add(32);
        myTreeSet.add(1000);

        // treeset printed using println statement
        System.out.println("The TreeSet contains these elements :- " + myTreeSet);

        // element removal from a treeset
        myTreeSet.remove(420);

        // treeset printed using interator
        System.out.print("The TreeSet using iterator :- ");
        Iterator<Integer> i = myTreeSet.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }

    //methods to access first and last elements in a treeset.
    System.out.println();
    System.out.println("First element of TreeSet is :- "+ myTreeSet.first());
    System.out.println("Last element of TreeSet is :-  "+ myTreeSet.last());

    }
}
