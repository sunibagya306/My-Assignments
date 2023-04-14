package week3.day2;

public class ChangeOddIndextoUppercase {
	public static void main(String[] args) {
		String input="changeme";
		char[] ch=input.toCharArray();
		String s="";
		
		for(int i= 0;i<=ch.length-1;i++) {
			
	if(i%2!=0) {
		
		s=s+Character.toUpperCase(ch[i]);
		
	}else {
		
		s=s+ch[i];
		
	}
			
		}
		
		System.out.println("Change the character to Uppercase " + s);
		
	}

}

