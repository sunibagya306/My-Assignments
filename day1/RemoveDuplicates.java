package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input = "PayPal India";
		char[] ch=input.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			//charset.add(ch[i]);
			if (!charSet.add(ch[i])){
			   dupCharSet.add(ch[i]);
			}
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);
		System.out.println("After remove duplicates ");
		for(Character character:charSet) {
			if(character!=' ') {
				System.out.println(character);
			}
		
			   
			
		}
	

	}

}
