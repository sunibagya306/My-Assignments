package week3.day2;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		String s=new String("stops");
		String str="emp123";
		System.out.println(text2==s);
		System.out.println(text2==text1);
		if(s.equals(text2)) {
			System.out.println("Both the arrays are same");
		}
		else {
			System.out.println("Not same");
		}

	}

}
