package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam";
		char[] ch=input.toCharArray();
		String rev="";
		
		for(int i= ch.length-1;i>=0;i--) 
		{
		    rev=rev+ch[i];
		}
		if(input.equals(rev))
		{
	      System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
			
		
    }
		

	}
}
