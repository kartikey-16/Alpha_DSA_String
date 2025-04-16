package String;


// count the numbers of lowercase vowels occurred in a string

public class CountLowerCaseVowels {

	
	public static void main(String [] args)
	{
		
		String str = "ashiyana";
		int count = 0;
		
		for(int i = 0 ; i < str.length(); i++)
		{
			char vow = str.charAt(i);
			
			if(vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' )
				count++;
		}
		System.out.println(count);
		
	}
}
