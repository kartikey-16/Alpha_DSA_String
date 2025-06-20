package in.leetcode;

public class FirstPalindromeString {
	


	private static String firstPalindrome(String[] words) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < words.length; i++)
		{
			if(isPalindrome(words[i]))
			{
				return words[i];
			}
		}
		return "";
	}
	public static boolean isPalindrome(String s)
	{
		int left = 0 , right = s.length()-1;
		while(left < right)
		{
			if(s.charAt(left) != s.charAt(right))
				return false;
			
			left++;
			right--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String [] words = {"abc", "car","ada","cde"};
		System.out.println(firstPalindrome(words));;
	}
}
