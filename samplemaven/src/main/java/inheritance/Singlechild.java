package inheritance;

public class Singlechild extends SingleParent{
	
	public void print()
	{
		System.out.println("my child class");
	}
	
	public static void main(String[] args) {
		
		Singlechild obj = new Singlechild();
		obj.print();
		obj.display();
		
	}
		

	}


