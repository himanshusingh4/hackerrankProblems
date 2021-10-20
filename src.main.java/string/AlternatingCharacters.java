package string;

public class AlternatingCharacters {
	
	public static void main(String args[]) {

		AlternatingCharacters testObj = new AlternatingCharacters();
		System.out.println(testObj.removeAlternatingChar("AAAA"));
		System.out.println(testObj.removeAlternatingChar("AAABBB"));
	}
	
	public int removeAlternatingChar(String input) {
		
		int count = 0;
		int i = 0;
		
		while(i+1 < input.length()) {
			
			if(input.charAt(i) == input.charAt(i+1)) {
				
				count++;
			}
			
			i++;
			
		}
		
		return count;
		
	}

}
