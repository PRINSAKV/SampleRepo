package superkeyword;

public class SuperClassMethodChild extends SuperClassMethod {

	public void print()
	{
		System.out.println("This is a super child class");

		super.display();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClassMethodChild obj = new SuperClassMethodChild();
		obj.print();
		//obj.display();
	}

	
}
