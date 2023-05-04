import java.util.*;
public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(2);
        l1.add(5);
        l2.add(12);
        l2.add(23);
        l2.add(45);
        l2.add(66);
        l2.add(73);
        l2.add(24);
        l2.add(48);
        l2.add(69);



        System.out.println("The Elements of arrayList 1 are- ");
        for(int i = 0; i <l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");

        }
        System.out.println("The Elements of arrayList 2 are- ");
        for(int i = 0; i <l2.size(); i++){
            System.out.print(l2.get(i));
            System.out.print(", ");

        }

        l1.addAll(l2);
        System.out.println("The Elements of Array1 + Array2 are- ");
        for(int i = 0; i <l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");

        }
    }
}
