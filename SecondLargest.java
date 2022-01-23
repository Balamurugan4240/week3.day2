package week3.day2.ass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		
        
		
		int[] data = {3,2,11,4,6,7};
		
		//pass the data to treeset to get ascending order
		Set<Integer> st = new TreeSet<Integer>();
		
		//Iterate to add the values inside set
		for (int i = 0; i < data.length; i++) {
			
			//adding values to treeSet
			st.add(data[i]);	
		
		}
		
		// create list and pass the set as argument coz set doesnot allow get() method.
		//Hence its values are added to list
		List<Integer> lt = new ArrayList<Integer>(st);
		
		//get the size of list
		int size = lt.size();
		
		//getting the second largest value from the list 
		System.out.println("Second Largest Number is:"+ lt.get(size-2));

	}

}
