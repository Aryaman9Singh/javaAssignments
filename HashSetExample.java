import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
myHashSet.add(6);
myHashSet.add(8);
myHashSet.add(12);
myHashSet.add(166); //duplicate value
myHashSet.add(166);
myHashSet.add(45);
myHashSet.add(1);

//HashSet can be printed normally too, using print statement
System.out.println("HashSet printed using print statement"+myHashSet);



//Hashset's own method to  print elements using an interator
System.out.println("HashSet printed using iterator");
Iterator<Integer> i = myHashSet.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}


//searching in HashSet
System.out.println(myHashSet.contains(13));
System.out.println(myHashSet.contains(6));

//clearing a HashSet
myHashSet.clear();
System.out.println("HashSet after using clear method"+myHashSet);

    }
}
