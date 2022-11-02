package stringlab;

public class StringLab {
	public static void capitalize(String word) {
System.out.println(word.toUpperCase().charAt(0) + word.substring(1).toLowerCase());
			
		}
	
	public static void main(String[] args) {
		
		String a = "blaZe";
		
		capitalize(a);

	}

}
