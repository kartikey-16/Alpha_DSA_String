package in.leetcode;

public class MergeAlternativeStrings {
	
	
	private static String mergeAlternatively(String word1, String word2) {
		
		 int len1 = word1.length();
		 int len2 = word2.length();
		 
		 int min  = Math.min(len1, len2);
		 
		 String longerString ="";
		 
		 if(len1 == min)
			 longerString = word2;
		 
		 if(len2 == min)
			 longerString = word1;
		 
		 char char1[]  = word1.toCharArray();
		 char char2[]  = word2.toCharArray();
		 StringBuilder sb = new StringBuilder();
		 
		 for(int i = 0 ;  i < min ; i++ )
		 {
			 sb.append(char1[i]);
			 sb.append(char2[i]);
		 }
		 
		 sb.append(longerString.substring(min));
		 
		 return sb.toString();
	}

	
	public static void main(String[] args) {
		String word1 ="abc";
		String word2 = "pqr";
		
		System.out.println(mergeAlternatively(word1 , word2));;
	}
}
