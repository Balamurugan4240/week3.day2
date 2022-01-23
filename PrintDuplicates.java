package week3.day2.ass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//declare list 1
		List<Integer> lt1 = new ArrayList<Integer>();
		
	    // adding values to list 1
		for (int i = 0; i < arr.length; i++) {
			
			lt1.add(arr[i]);
		}
	
		// get the size of list 1
		int size = lt1.size();
		
		//declare a set to remove duplicates in list 1
		Set<Integer> st = new HashSet<Integer>();
		
		// declare list2 to store duplicates
		List<Integer> lt2 = new ArrayList<Integer>();
		
		//iterate to add list1 to set
		for(int j=0; j<size; j++) {
			
			//check whether set doesnot have the elements of list1
			if(!st.add(lt1.get(j))) {
				
				//if so, add to list 2
				lt2.add(lt1.get(j));		
			}
				
		}
		
		System.out.println("Duplicates in the given array is:" + lt2);

	}

}
