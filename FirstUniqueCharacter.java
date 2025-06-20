package in.leetcode;

import java.util.*;

public class FirstUniqueCharacter {
	
	public static int firstUnique(String s)
	{
		Map<Character ,Integer> map = new HashMap<>();
		for(int i = 0 ; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
				// next time if value is present in the  map
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				// for the first  time 
				map.put(ch, 1);
			}
			
		}
		for(int i = 0 ; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			if(map.get(ch) == 1)
			{
				return i;
			}
		}
	
		return -1;
	}
	
	public static void main(String[] args) {
		
		String s = "leetcode";
		System.out.println(firstUnique(s));
	}

}
