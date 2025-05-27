package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		a.add("apple");
		a.set(1, "banana");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("apple"));
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("apple"));
		System.out.println(a.lastIndexOf("apple"));
		a.remove(2);
		System.out.println(a);
		System.out.println(a.size());
		
		
		
	}

}
