package week4.day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer>nums =new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			nums.add(data[i]);
		}
		
			List<Integer>list=new ArrayList<Integer>(nums);
			System.out.println("Second lartest number is " + list.get(list.size()-2));
		}
	

	}


