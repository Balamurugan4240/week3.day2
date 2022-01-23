package week3.day2.ass;

public class DuplicatesAssignment {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of Java sessions sessions in java week1";
		
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
		for (int j = i+1; j < split.length; j++) {
			
			if(split[i].equalsIgnoreCase(split[j])){
				
				split[j]="";
				
			}
				
		}
					
		}
	  
		System.out.println("Duplicates removed string:");
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.print(split[i] + " ");
		}

	}

}
