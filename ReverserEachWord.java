package String;

public class ReverserEachWord {
	    public static String reverseEachWord(String str) {
	        if (str == null || str.isEmpty()) return str;

	        String[] words = str.split(" ");  // Split the string by spaces
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
		        System.out.println(word);

	            StringBuilder reversed = new StringBuilder(word);
	            result.append(reversed.reverse().toString()).append(" ");
	        }

	        return result.toString().trim();  // Remove trailing space
	    }

	    public static void main(String[] args) {
	        String input = "Hello world from Java";
	        String output = reverseEachWord(input);
	        System.out.println(output);  // Output: "olleH dlrow morf avaJ"
	    }
}
