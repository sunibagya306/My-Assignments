package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] arr= {"HCL","Wipro","Aspire Systems","CTS"};
		
		int length=arr.length;
		List<String> list=new ArrayList<String>();
		for(int i=0;i<length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		for(int i=list.size()-1;i>=0;i--) {
			if(i!=0) {
				System.out.println(list.get(i)+",");
			}else {
				System.out.println(list.get(i));
				
			}
		}
		
		}

	}


