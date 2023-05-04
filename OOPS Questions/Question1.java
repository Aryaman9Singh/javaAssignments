class Singleton{
	
	private static Singleton inst = null;
	public String a;
	
	private Singleton() {
		a = "Inheritance Testing";
	}
	public static Singleton getInst() {
		if(inst == null)
			inst = new Singleton();
		return inst;
	}
	
}
public class Question1 {
    
}
