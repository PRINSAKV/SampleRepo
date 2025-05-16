package acessmodifer;

public class Acess1 {
	
	public void display1() {
		
		System.out.println("Always");
	}
	private void display2() {
		System.out.println("whereever");
		
	}
	protected void display3() {
		System.out.println("How are you");
	}
	void display4() {
		System.out.println("Hai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acess1 obj = new Acess1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
