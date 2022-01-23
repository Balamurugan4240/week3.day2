package week3.day2.ass;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String text1="stops";
		String text2="potss";
		
		int len1 = text1.length();
		int len2 = text2.length();
		
		if(len1==len2) {
			
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			
			//List<Character> lt = new ArrayList<Character>();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("It's an anagram");
				
			} else {
				
				System.out.println("It's not an anagram");				
			}
			
		}
		
		else {
			System.out.println("String length is not same");
		}


	}

}
