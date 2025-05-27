package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		Set<String> s1 = new HashSet<String>();
		s.add("name");
		s.add("priya");
		s.add("ravi");
		s.add("anu");
		System.out.println(s);
		System.out.println();
		System.out.println(s.contains("priya"));
		System.out.println(s.isEmpty());
		s.remove(1);
		System.out.println(s);
		System.out.println(s.size());
		
		
		}

}
