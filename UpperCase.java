package week3.day2.ass;

public class UpperCase {

	public static void main(String[] args) {
		
		
		String test = "changeme";
		
		char[] ch = test.toCharArray();
	
		// Traverse through each character (using loop)
		for(int i=0; i<ch.length;i++) {
			
			//find the odd index within the loop (use mod operator)
			if(i%2!=0) {
				
				//change the old index to uppercase
				ch[i] = Character.toUpperCase(ch[i]);
				
			}	
			
		}
		
		System.out.println(ch);

	}

}
