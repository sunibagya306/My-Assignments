package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text ="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split= text.split(" ");
		String duplicate="";
		String removeduplicate =text;
		
		for(int i=0;i<=split.length-1;i++) {
			
	    for(int j=i+1;j<=split.length-1;j++) {
				if(split[i].equals(split[j])) {
					count++;
					duplicate=split[j];
					
				}
					
					
				}
					
		}
		if(count>0) {
			String replaceAll=removeduplicate.replaceAll(duplicate,"");
			System.out.println("Without duplicates: " + " " +replaceAll);
		}else {
			System.out.println("Given string " +text);
		}

	}

}
