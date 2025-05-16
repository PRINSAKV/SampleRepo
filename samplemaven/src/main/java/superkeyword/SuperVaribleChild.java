package superkeyword;

public class SuperVaribleChild extends SuperVarible{
	String color = "blue";
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String args[])
	
{
		SuperVaribleChild obj = new SuperVaribleChild();
		obj.display();
}
		
}
