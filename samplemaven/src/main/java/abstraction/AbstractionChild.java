package abstraction;

public class AbstractionChild extends AbstractParent {
	
	public static void main(String args[])
	{
		AbstractionChild obj = new AbstractionChild();//object creation
		obj.print();
		obj.display();
		obj.show();
		
		AbstractParent obj1 = new AbstractionChild();//reference creation
		obj.display();
		obj.print();
		
	}
	
	public void display()
	{
		System.out.println("Class");
	}
	
	public void show()
	{
		System.out.println("hello");
	}
}
