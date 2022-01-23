package week3.day2.ass;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		
		String test = "I am a software tester"; 
		
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if(i%2==0) {
				
				System.out.print(split[i] + " ");	
			}
			
			else {
				
		     char[] rev = split[i].toCharArray();
		     
		     for(int j=((rev.length)-1); j>=0; j--) {
		    	 
		    	System.out.print(rev[j]);	 
		     }
				
			System.out.print(" ");
		     
			}
			
		}

	}

}
