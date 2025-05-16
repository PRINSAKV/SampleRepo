package polymorphism;

public class ChildPolymorphism extends ParentPolymorphism {
		
	public void sum(int a, int b) {
	
		super.sum(4,2);
		int sum = a-b;
		System.out.println(sum);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildPolymorphism obj =new ChildPolymorphism();
		obj.sum(4,8);
	}
}


