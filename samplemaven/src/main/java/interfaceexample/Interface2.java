package interfaceexample;

public class Interface2 implements Interface1 {
	
	public void display1()
	{
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface2 obj = new Interface2();
		obj.display();
		obj.display1();
		obj.print();
		
		Interface1 obj1 = new Interface2();
		obj.display();
		obj.print();
		
		
	}
		public void display()
		{
			System.out.println("Child");
		}
		
		public void print()
		{
			System.out.println("Grandparent");
			
		}
}
