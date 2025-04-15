package String;

public class AnagramString {

	private static final int MAX_CHAR = 26;
	
	private static boolean areAnagram(String str, String str1) {
		// TODO Auto-generated method stub
		
		int [] freq = new int[MAX_CHAR];
		
		for(int i = 0 ; i < str.length(); i++)
			freq[str.charAt(i) - 'a']++;
		
		for(int i = 0 ; i < str1.length(); i++)
			freq[str1.charAt(i) - 'a']--;
		
		for(int count : freq)		{
			if(count != 0)
				return false;
		}
		
		return true;
	}
	
	
	
	public static void main(String [] args)
	{
		String str = "race";
		String str1 = "racer";
		
		System.out.println(areAnagram(str,str1));
	}

}
