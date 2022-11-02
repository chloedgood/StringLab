package stringlab;

public class StringLab {
	
	public static void capitalize(String word) {
		System.out.println(word.toUpperCase().charAt(0) + word.substring(1).toLowerCase());	
		}
	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo"));
		}
	public static void firstThingsFirst(String a, String b) {
		if (a.toLowerCase().charAt(0) < b.toLowerCase().charAt(0)) {
		System.out.println(a.concat("" + b));
		} 
		else 
			System.out.println(b.concat(" " +a));
		}
	
	public static void reverse(String e) {
		String backwardsWord = "";
	
		for (int i = e.length() - 1; i >= 0; i++);
		{
		backwardsWord += (e.charAt(1) + "");
		}
		System.out.println(backwardsWord); }
	
	public static void soLong(String c, String d) {
		if (c.length() > d.length()) {
		System.out.println(c); 
		} else if (c.length() == d.length()) {
		System.out.println(c.concat("" + d));
		} else {
			System.out.println(d); 
		
		}
		}
	public static void afterMath(String phrase) {
		if (phrase.contains("math")) {
		System.out.println(phrase.indexOf("math" + "" ));
		} else {
			System.out.println("dud");
		}
		}
	public static void letterize(String word) {
			   {
			       int length;
			        char current;
			      
			        String j = "";
					length = j.length();

			       for (int count = 0; count < length; count++)
			        {
			          current = j.charAt(count);
			           System.out.println (current);
			            count++;
			        }
			    }
			}
		
	
	
	
	public static void main(String[] args) {
		
		String a = "blaZe";
		String b = "Where's Waldo";
		String c = "Chloe ";
		String d = "Tired ";
		String e = "base";
		String f = "Potato";
		String g = "Lettuce";
		String h = "I am bad at math";
		String j = "Java";
		
		
		capitalize(a);
		wheresWaldo(b);
		firstThingsFirst(c,d);
		reverse(e);
		soLong(f,g);
		afterMath(h);
		letterize(j);
	}

}
