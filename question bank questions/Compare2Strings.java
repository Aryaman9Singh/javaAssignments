
import java.util.Scanner; 
public class Compare2Strings
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("Enter String 1");
		String str1 = sc.nextLine();
		
		System.out.println("Enter string 2");
		String str2 = sc.nextLine();
		
		String str3 = "";
		for(int i = 0; i < str2.length(); i++){
		    char ch;
		    ch = str2.charAt(i);
		    str3 = ch+str3;
		}
		if(str1.equals(str3)){
		    System.out.println("Strings are equal");
		}
		else{
		    System.out.println("Strings are not equal");
		}
		sc.close();
	}
}
