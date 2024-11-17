package javaNotes;

public class Array {
	
	String name;

	public static void main(String[] args) {
		
	
		String [] listNames = { "Kumar", "Hari", "Bala", "Ramesh" };
		
		int lengthofArray = listNames.length;
		
		System.out.println("The length of the listNames array is : " + lengthofArray + "\n");
		
		//System.out.println("\n");  // on using this more gap is displaying on the output
		
			for( String i : listNames) {
				
				if(i == "Bala") {
					
					//on using the continue keyword , the "Bala" array element will be skipped
					continue; 
				}
				
				System.out.println("The list of employees who are not working in Zelar : \n " + i);
				
			}
	}

}