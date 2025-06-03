package in.leetcode;
import java.util.*;
public class WordPattern {

	private static boolean wordPattern(String pattern, String s) {
		// TODO Auto-generated method stub
		Map<Character, String> charMap = new HashMap<>();
		Map<String,Character > wordMap = new HashMap<>();
		String words[] = s.split(" ");
		if(s.length() != s.length())
			return false;
		
		for(int i = 0 ; i < words.length; i++)
		{
			char ch = pattern.charAt(i);
			String word= words[i];
			if(!charMap.containsKey(ch))
			{
				if(wordMap.containsKey(word))
					return false;
				else
				{
					charMap.put(ch, word);
					wordMap.put(word, ch);
				}
			}
			else
			{
				String mappedWord = charMap.get(ch);
				if(!mappedWord.equals(word))
					return false;
			}
		}
		
		return true;
		
	}

	
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		System.out.println(wordPattern(pattern,s));;
	}
}
