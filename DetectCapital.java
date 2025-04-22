package String;

public class DetectCapital {
	
	private static boolean detectCapitals(String word) {
		// TODO Auto-generated method stub
		if(allCaps(word) || allLower(word) || firstCaps(word))
		{
			return true;
		}
		return false;
		
	}
	
	private static boolean allCaps(String word)
	{
		int count = 0;
		for(int i = 0 ; i< word.length(); i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
			{
				count++;
			}
		}
		if(count == word.length())
		{
			return true;
		}
		return false;
	}
	private static boolean allLower(String word)
	{
		int count = 0;
		for(int i = 0 ; i< word.length(); i++)
		{
			if(Character.isLowerCase(word.charAt(i)))
			{
				count++;
			}
		}
		if(count == word.length())
		{
			return true;
		}
		return false;
	}
	
	private static boolean firstCaps(String word)
	{
		
		if(Character.isUpperCase(word.charAt(0)) && allLower(word.substring(1)))
			return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		
		String word = "USA";
		System.out.println(detectCapitals(word));
	}

	

}
