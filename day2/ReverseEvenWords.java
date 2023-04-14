package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text ="I am a software tester";
        String[] split=text.split(" ");
        for(int i=0;i<=split.length-1;i++) {
        	if(i%2!=0) {
        		char[] ch=split[i].toCharArray();
        		for(int j=ch.length-1;j>=0;j--) {
        			System.out.println(ch[j]);
        		}
        		System.out.println(" ");
        		
        	}else {
        		System.out.println(split[i] +" ");
        	}
        }
	}

}


