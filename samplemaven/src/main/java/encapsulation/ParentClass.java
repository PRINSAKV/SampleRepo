package encapsulation;

public class ParentClass {
	public void setter(String name, int age)
	{
		this.name= name;
		this.age = age;
	}
	private String name;
	private int age;
	public void getter()
	{
	System.out.println(name+" "+age);	
	}

}
