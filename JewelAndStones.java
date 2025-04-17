package in.leetcode;

import java.util.*;

public class JewelAndStones {
	
	private static int numJewelsInStones(String jewel, String stones) {
	    int count = 0;
		Set<Character> set = new HashSet<>();
		
		for(int i = 0 ; i<jewel.length() ;i++)
		{
			char ch = jewel.charAt(i);
			set.add(ch);
		}
		
		for(int i = 0 ; i< stones.length() ;i++)
		{
			char ch = stones.charAt(i);
			if(set.contains(ch))
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		String jewel = "aA";
		String stones ="aAAbbbb";
		
		System.out.println(numJewelsInStones(jewel ,stones));
	}

	

}
