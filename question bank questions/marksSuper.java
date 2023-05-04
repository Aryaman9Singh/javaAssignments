// Java code to show use of super keyword with variables
class Subject {
	int maxMarks = 100;
}

class Science extends Subject {
	int maxMarks = 50;

	void display()
	{
		
        System.out.println("Maximum marks in Science : " + maxMarks);
		System.out.println("Maximum marks Overall: "
						+ super.maxMarks);
	}
}

class Maths extends Subject{
    int maxMarks = 50;
    void display(){
        System.out.println("Maximum marks in Science : " + maxMarks);
        System.out.println("Maximum marks Overall: "
						+ super.maxMarks);
    }
}


class Test {
	public static void main(String[] args)
	{
		Science science = new Science();
        Maths maths = new Maths();
		science.display();
        maths.display();
	}
}
