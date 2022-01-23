package week3.day2.ass;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		
		// convert the string into char array
		char[] ch = str.toCharArray();
		
	//iterate each character array element	
		for(char each: ch){
			
			// checks each element contains e and get the count
            if(each == 'e'){
                count++;
			}
			
		}
		   
	  System.out.println("No. of occurrence 'e' is:" +count);  

	}

}
