package aggregation;

public class ChildClass
{
	String state,city;
	Parentclass ref;
	
public ChildClass(String state,String city,Parentclass ref)
{
	this.city = city;
	this.state = state;
	this.ref = ref;
}

public void display()
{
	System.out.println(ref.name+" "+ ref.rollno+" "+ ref.address);
	System.out.println(city+ " " +state);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated 
		Parentclass obj = new Parentclass("priya",21,"abcd");
		ChildClass obj1 = new ChildClass("Kannur","Kerala",obj);
		obj1.display();	

}
}
