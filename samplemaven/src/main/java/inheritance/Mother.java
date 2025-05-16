package inheritance;

public class Mother extends Father {
	
	public void print()
	{
		System.out.print("Mother class");
	}
	public static void main(String args[])
	{
		Mother obj=new Mother();
		obj.display();
		obj.print();
		
		
	}

}
