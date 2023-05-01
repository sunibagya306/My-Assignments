package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String input="suneetha";
		
		char[] ch= input.toCharArray();
		
		Set<Character> set =new LinkedHashSet<Character>();
		
		for(int i=0;i<ch.length;i++) {
			
			set.add(ch[i]);
			
			System.out.println(set);
			
		}
		
		

	}

}
