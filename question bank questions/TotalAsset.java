// //initializes a new array of size 10; index 0-9
// class Total {
//    public int[] arr = new int[10];

// }

// // adds the cash from index 0 - 4
// class Cash extends Total {
//    public Cash() {
//       for (int ch = 0; ch < 5; ch++) {
//          arr[ch] = ch;
//       }
//    }
// }

// // adds the credit after index 4
// class Credit extends Total {
//    public Credit() {
//       for (int cr = 5; cr < 10; cr++) {
//          arr[cr] = cr;
//       }
//    }
// }

// public class TotalAsset {
//    public static void main(String[] args) {

//       Total Total = new Total();
//       Cash cashRecieved = new Cash();
//       Credit creditRecieved = new Credit();
//       for (int i = 0; i < 10; i++) {
//          System.out.println(Total.arr[i]);
//       }
//    }
// }






// import java.util.Scanner;

// //initializes a new array of size 10; index 0-9
// class Total {
//    public int[] arr = new int[10];

// }

// // adds the cash from index 0 - 4
// class Cash extends Total {
//    public Cash() {
//       Scanner sc = new Scanner(System.in);
//       for (int ch = 0; ch < 5; ch++) {
//          System.out.println("Enter number 1-5");
//          int cash = sc.nextInt();
//          arr[ch] = cash;
//       }
//    }
// }

// // adds the credit after index 4
// class Credit extends Total {
//    public Credit() {
//       Scanner sc = new Scanner(System.in);

//       for (int cr = 5; cr < 10; cr++) {
//          System.out.println("Enter number 4-9");
//          int credit = sc.nextInt();
//          arr[cr] = credit;
         
//       }
//    }
// }

// public class TotalAsset {
//    public static void main(String[] args) {

//       Total Total = new Total();
//       Cash cashRecieved = new Cash();
//       Credit creditRecieved = new Credit();
//       for (int i = 0; i < 10; i++) {
//          System.out.println(Total.arr[i]);
//       }
//    }
// }



import java.util.Arrays;

class ParentClass {
    private int[] elements = new int[10];

    public void setElement(int index, int value) {
        elements[index] = value;
    }

    public int getElement(int index) {
        return elements[index];
    }

    public int[] getElements() {
        return elements;
    }
}

class Subclass1 extends ParentClass {
    public Subclass1() {
        for (int i = 0; i < 5; i++) {
            setElement(i, i);
        }
    }
}

class Subclass2 extends ParentClass {
    public Subclass2() {
        for (int i = 5; i < 10; i++) {
            setElement(i, i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        Subclass1 subclass1 = new Subclass1();
        Subclass2 subclass2 = new Subclass2();

        for (int i = 0; i < 5; i++) {
            parent.setElement(i, subclass1.getElement(i));
        }

        for (int i = 5; i < 10; i++) {
            parent.setElement(i, subclass2.getElement(i - 5));
        }

        System.out.println(Arrays.toString(parent.getElements()));
    }
}