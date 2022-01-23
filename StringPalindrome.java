package week3.day2.ass;

public class StringPalindrome {

	public static void main(String[] args) {
	
		//Declare A String value as"madam"
				String s = "madam", 
						
				//Declare another rev value as ""
				rev = ""; 

			    int length = s.length();

			    //Iterate over the String in reverse order
			    for (int i = length - 1; i >= 0; i--) {
			      
			    //Add the char into rev	
			    	rev = rev + s.charAt(i);
			    
			    //Compare the original String with the reversed String, if it is same then print palinDrome
			    if (s.equals(rev)) {
			      System.out.println("The string is a palindrome.");
			    }
			    else {
			      System.out.println("The string isn't a palindrome.");

			    }
			}

	}

}
