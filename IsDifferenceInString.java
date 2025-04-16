package String;

public class IsDifferenceInString {

	private static String isDifference(String str, String str1)
	{
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) != str1.charAt(i) && str.length() != str.length())
				return str1.substring(i , str1.length()-1);
		}
		return null;
		
	}
	
	public static void main(String [] args)
	{
		String str = "race";
		String str1 = "racer";
		
		System.out.println(isDifference(str,str1));
	}

}
