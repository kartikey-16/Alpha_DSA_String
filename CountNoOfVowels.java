package in.leetcode;

public class CountNoOfVowels {


	private static int vowelString(String[] words, int left, int right) {
		// TODO Auto-generated method stub
		int count =0;
		while(left <= right)
		{
			if(checkVowel(words[left]))
			{
				count++;
			}
			left++;
		}
		return count;
		
	}

	
	private static boolean checkVowel(String s) {
		// TODO Auto-generated method stub
		char c1 = s.charAt(0);
		char c2 = s.charAt(s.length()-1);
		if(c1 == 'a' || c1 == 'e'  || c1 == 'i' || c1 == 'o' ||  c1 == 'u' )
		{
			if(c2 == 'a' || c2 == 'e'  || c2 == 'i' || c2 == 'o' ||  c2 == 'u' )
				return true;
		}
		return false;
	}


	public static void main(String[] args) {
		String[] words = {"are","any","u"};
		int left = 0, right = 2;
		System.out.println(vowelString(words, left, right));
	}
}
