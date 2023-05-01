package week4.day1;

import java.util.ArrayList;

import java.util.List;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,6,7,8,9,10};
	
	TreeSet<Integer> num=new TreeSet<Integer>();
	
	for(int i=0;i<arr.length;i++){
		num.add(arr[i]);
		
		
	}
	List<Integer> list=new ArrayList<Integer>(num);
	
	for(int i=0;i<list.size();i++) {
		if(i+1!=arr[i]) {
			System.out.println(i+1);
			break;
			
		}
	}
	
	

	}

}
