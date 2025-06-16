package in.leetcode;
import java.util.*;
public class WordsContainingCharacter {

	private static List<Integer> findWordsContaining(String[] words, char x) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int  i = 0 ; i < words.length ; i ++)
		{
			if(containCharcter(words[i] ,x))
			{
				list.add(i);
			}
		}
		return list; 
	}
	

	private static boolean containCharcter(String word, char x) {
		// TODO Auto-generated method stub
		for(int  i = 0 ; i < word.length() ; i++)
		{
			char ch = word.charAt(i);
			if(ch == x)
				return true;
		}
		
		return false;
	}


	public static void main(String[] args) {
		String[] words = {"leet", "cod"};
		char x ='e';
		
		for(int  i : findWordsContaining(words , x))
		{
			System.out.print(i+" ");
		}
		
		
	}

}
