package week4.day1;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
        
		
		
		String[] splits=text.split(" ");
		
		Set<String> set=new LinkedHashSet<String>();
			for(int i=0;i<splits.length;i++){
			set.add(splits[i]);
		}
		List<String> list =new ArrayList<String>(set);
		for(int i=0;i<list.size();i++) {
		
			System.out.println(list.get(i)+" ");
			
		
			
			
			
		}
		
		
	}

}
