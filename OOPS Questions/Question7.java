import java.util.*;

abstract class DessertItem {
	int candy_storage = 30;
	int cookie_storage = 40;
	int icecream_storage = 50;
	abstract int getCost();
}

class Candy extends DessertItem {
	String role;
	Candy(String a){
		role=a;
	}
}

class Cookie extends DessertItem {
	String role;
	Cookie(String a){
		role=a;
	}
}

class IceCream extends DessertItem {
	String role;
	IceCream(String a){
		role=a;
	}
}

public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role: ");
		String role = sc.nextLine();
		
	}

}