package in.leetcode;

public class TruncateSentence {

	private static String truncateSentence(String s, int k) {
		
		String word[] = s.split(" ");
		
		int index = 0 ; 
		StringBuilder sb = new StringBuilder();
		
		while(k!=0)
		{
			sb.append(word[index]+" ");
			index++;
			k--;
		}
		
		return sb.toString().trim();
	}

	
	public static void main(String[] args) {
		String s = "Hello How are you contestant";
		int k = 4;
		
		System.out.println(truncateSentence(s,k));;
	}
}
